SELECT i.id
, ni.fish_name
, i.length

FROM fish_info AS i

JOIN fish_name_info AS ni ON i.fish_type = ni.fish_type

WHERE
    (ni.fish_name, i.length) IN (
        SELECT ni.fish_name, MAX(i.length)
        FROM fish_info AS i
        JOIN fish_name_info AS ni ON i.fish_type = ni.fish_type
        GROUP BY ni.fish_name)

ORDER BY i.id