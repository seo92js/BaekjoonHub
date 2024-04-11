# department 회사 부사 정보, employees 회사 사원 정보, grade 사원의 평가 정보
# 한해 편가 점수 가장 높은 사원 정보
# 22년도에 평가 정수가 가장 높은 사원들의 점수 ,사번, 성명, 직책, 이메일
# 평가 점수는 상,하반기 점수의 합
# SELECT SUM(gr.score) AS score, em.emp_no, emp_name, position, email
# FROM hr_department AS dp
# JOIN hr_employees AS em ON dp.dept_id = em.dept_id
# JOIN hr_grade AS gr ON em.emp_no = gr.emp_no
# GROUP BY em.emp_no, em.emp_name, em.position, em.email
# ORDER BY score DESC
# LIMIT 1

SELECT SUM(gr.score) AS score, em.emp_no, emp_name, position, email
FROM hr_employees AS em
JOIN hr_grade AS gr ON em.emp_no = gr.emp_no
GROUP BY em.emp_no
ORDER BY score DESC
LIMIT 1