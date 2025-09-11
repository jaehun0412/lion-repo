select * from employees;
select * from departments;

-- 사원의 이름과 부서명을 출력하세요.
select 
	CONCAT(e.first_name, ' ', e.last_name) 이름,
    d.department_name 부서명
from employees e, departments d
where e.department_id = d.department_id;

-- 부서별 평균 급여보다 많이 받는 직원을 조회하세요.
select * from employees o
where o.salary > (
	select 
        avg(i.salary) 
	from employees i 
    where o.department_id = i.department_id
)
order by department_id;

-- 각 부서에서 최고 급여를 받는 직원의 정보
select * from employees o
where o.salary = (
	select MAX(i.salary)
    from employees i
    where o.department_id = i.department_id
    group by i.department_id
)
order by department_id;