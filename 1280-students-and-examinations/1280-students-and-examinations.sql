select
    Students.student_id as student_id,
    student_name,
    Subjects.subject_name,
    count(Examinations.subject_name) as attended_exams
from
    Students
cross join
    Subjects
left join
    Examinations
on
    Students.student_id = Examinations.student_id
    and
    Subjects.subject_name = Examinations.subject_name
group by
    student_id,
    subject_name
order by
    student_id;