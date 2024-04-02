SELECT icecream_info.flavor
FROM icecream_info
INNER JOIN first_half ON icecream_info.flavor = first_half.flavor
WHERE first_half.total_order > 3000 AND icecream_info.ingredient_type = 'fruit_based'
ORDER BY first_half.total_order DESC