-- 식당id, 식당이름, 음식종류, 즐겨찾기수, 주소, 리뷰 평균
SELECT rest_info.rest_id
, rest_info.rest_name
, rest_info.food_type
, rest_info.favorites
, rest_info.address
, ROUND(AVG(rest_review.review_score), 2) AS score
FROM rest_info
JOIN rest_review ON rest_info.rest_id = rest_review.rest_id
WHERE rest_info.address LIKE "서울%"
GROUP BY rest_info.rest_id
ORDER BY score DESC, rest_info.favorites DESC