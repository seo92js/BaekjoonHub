SELECT ingredient_type, SUM(total_order) AS total_order
FROM first_half
JOIN icecream_info ON first_half.flavor = icecream_info.flavor
GROUP BY ingredient_type
ORDER BY SUM(total_order) ASC