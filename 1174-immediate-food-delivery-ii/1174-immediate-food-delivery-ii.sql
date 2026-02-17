with first_orders as (
    select * from delivery
             where (order_date,customer_id)
             in (select  min(order_date),customer_id from delivery group by customer_id)
)


select round( avg( first_orders.order_date = first_orders.customer_pref_delivery_date ) *100 ,2)as  immediate_percentage  from first_orders;