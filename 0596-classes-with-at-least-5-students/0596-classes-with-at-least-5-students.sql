# Write your MySQL query statement below
select a.class 
from
(select count(*) as students_count, class
from Courses
group by class) a
where a.students_count > 4;