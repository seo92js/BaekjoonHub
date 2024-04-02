SELECT book_id, DATE_FORMAT(published_date, "%Y-%m-%d") AS published_date
FROM book
WHERE LEFT(book.published_date , 4) = '2021' 
AND book.category = '인문'
ORDER BY published_date ASC