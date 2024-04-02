SELECT 
    parent.id
    , COUNT(child.id) AS child_count
FROM 
    ecoli_data AS parent
LEFT JOIN 
    ecoli_data AS child ON parent.id = child.parent_id
GROUP BY parent.id
ORDER BY parent.id ASC