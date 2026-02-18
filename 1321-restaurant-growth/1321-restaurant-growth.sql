with cal_data as (
    select customer.visited_on,
           sum(customer.amount) as sum_amount,
           row_number() over (order by customer.visited_on) as rn
    from customer  group by customer.visited_on
),
avg_data as(
    select *,
           sum(sum_amount) over (order by cal_data.visited_on rows between 6 preceding and current row ) as amount,
           round(avg(sum_amount) over (order by cal_data.visited_on rows between 6 preceding and current row ),2) as avg_amount
    from cal_data
)
select
    visited_on,
    amount , avg_amount as average_amount
from avg_data
where rn > 6;