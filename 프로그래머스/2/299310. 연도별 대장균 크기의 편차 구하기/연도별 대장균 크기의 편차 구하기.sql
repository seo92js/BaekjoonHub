WITH max_table AS (
    SELECT YEAR(differentiation_date) year
    , MAX(size_of_colony) AS max_size
    FROM ecoli_Data
    GROUP BY year
)

SELECT m.year
, m.max_size - e.size_of_colony AS year_dev
, id
FROM ecoli_data AS e
INNER JOIN max_table AS m ON YEAR(e.differentiation_date) = m.year
ORDER BY m.year, year_dev