SELECT count(user_id) AS users
FROM user_info
WHERE LEFT(joined, 4) = 2021
AND
age >= 20 
AND 
age <= 29
