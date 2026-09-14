# Write your MySQL query statement below
select a.customer_id from
(select
    ca.customer_id as customer_id,
    count(distinct cb.product_key) as countu
from
    Customer ca
cross join
    Product
left join
    Customer cb
on
    ca.customer_id = cb.customer_id
    and
    Product.product_key = cb.product_key
group by
    ca.customer_id
having
    countu = (select count(*) from Product) ) as a;