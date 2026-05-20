CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      select salary from (select salary, DENSE_RANK() OVER(ORDER BY Salary DESC) as rnk from Employee ) as tb where tb.rnk = N limit 1
  );
END