SELECT pt_name
, pt_no
, gend_Cd
, age
, CASE WHEN tlno IS NULL THEN 'NONE' ELSE tlno END AS tlno
FROM patient
WHERE age <= 12 AND gend_cd = 'W'
ORDER BY age DESC, pt_name ASC