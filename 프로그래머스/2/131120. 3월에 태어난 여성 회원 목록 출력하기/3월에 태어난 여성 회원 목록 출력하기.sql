SELECT member_id, member_name, gender, DATE_FORMAT(date_of_birth, "%Y-%m-%d") AS date_of_birth
FROM member_profile
WHERE SUBSTR(date_of_birth, 6, 2) = '03' 
AND tlno IS NOT NULL 
AND gender = 'W'
ORDER BY member_id ASC