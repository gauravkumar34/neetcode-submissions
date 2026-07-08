-- Write your query below
select employee_id, case 
WHEN name NOT Like 'M%' and employee_id%2 != 0
then salary else 0 end as bonus
FROM employees
ORDER BY employee_id;