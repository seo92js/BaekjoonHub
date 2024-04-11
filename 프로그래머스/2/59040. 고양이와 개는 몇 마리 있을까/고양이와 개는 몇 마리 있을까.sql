SELECT animal_type, COUNT(animal_id) AS count
FROM animal_ins
GROUP BY animal_type
HAVING animal_type IN ('Cat', 'Dog')
ORDER BY animal_type ASC