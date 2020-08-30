SELECT (salary*months) as earnings, count(*) from Employee GROUP BY 1 ORDER BY earnings desc limit 1;
