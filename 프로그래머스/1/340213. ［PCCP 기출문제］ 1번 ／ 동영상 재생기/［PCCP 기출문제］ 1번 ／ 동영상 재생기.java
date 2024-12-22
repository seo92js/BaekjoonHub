class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLen = parseTime(video_len);
        int position = parseTime(pos);
        int opStart = parseTime(op_start);
        int opEnd = parseTime(op_end);

        // 초기 위치가 오프닝 구간에 있으면 끝점으로 이동
        if (isWithinRange(position, opStart, opEnd)) {
            position = opEnd;
        }

        // 명령어 처리
        for (String command : commands) {
            if (command.equals("prev")) {
                position = adjustTime(position, -10, opStart, opEnd, videoLen);
            } else if (command.equals("next")) {
                position = adjustTime(position, 10, opStart, opEnd, videoLen);
            }
            
            // 명령어 실행 후에도 오프닝 구간에 있으면 끝점으로 이동
            if (isWithinRange(position, opStart, opEnd)) {
                position = opEnd;
            }
        }

        return formatTime(position);
    }

    private int parseTime(String time) {
        return Integer.parseInt(time.replace(":", ""));
    }

    private String formatTime(int time) {
        int minutes = time / 100;
        int seconds = time % 100;
        return String.format("%02d:%02d", minutes, seconds);
    }

    private boolean isWithinRange(int time, int start, int end) {
        return time >= start && time <= end;
    }

    private int adjustTime(int currentTime, int secondsToAdjust, int opStart, int opEnd, int videoLen) {
        // 초와 분 계산
        int minutes = currentTime / 100;
        int seconds = currentTime % 100;

        // 초 조정
        seconds += secondsToAdjust;

        // 초가 60 이상 또는 음수일 경우 분 조정
        while (seconds >= 60) {
            seconds -= 60;
            minutes += 1;
        }
        while (seconds < 0) {
            seconds += 60;
            minutes -= 1;
        }

        // HHMM 형식으로 변환
        int adjustedTime = minutes * 100 + seconds;

        // 경계값 처리
        if (isWithinRange(adjustedTime, opStart, opEnd)) {
            return opEnd; // 오프닝 끝점으로 이동
        } else if (adjustedTime > videoLen) {
            return videoLen; // 비디오 길이를 초과하지 않음
        } else if (adjustedTime < 0) {
            return 0; // 시작 시간보다 작을 수 없음
        }

        return adjustedTime;
    }
}
