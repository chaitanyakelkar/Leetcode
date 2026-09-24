# Write your MySQL query statement below
(select name as results from MovieRating join Users on MovieRating.user_id = Users.user_id group by name order by count(rating) desc, name limit 1)
union all
(select title from MovieRating join Movies on MovieRating.movie_id = Movies.movie_id where created_at between '2020-02-01' and '2020-02-29' group by title order by avg(rating) desc, title limit 1);