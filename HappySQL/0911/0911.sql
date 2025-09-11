desc emp;
show tables;
desc salgrade;
select * from salgrade;

-- Non-Equi Join
select e.ename, e.sal, s.grade
from emp e, salgrade s
where e.sal BETWEEN s.min_salary AND s.max_salary;

select e.ename, e.deptno, d.dname
from emp e, dept d
where e.deptno = d.deptno;
# Oracle은 데이터가 없는 쪽에 (+)를 붙이면 Outer Join이 동작한다.

select * from dept;

-- Outer Join: 내가 보고싶은 데이터가 있는 쪽을 명시해 Join 한다.
# 왼쪽 테이블에 있는 값이 오른쪽에 없더라도 출력하고 싶다 => LEFT OUTER JOIN
# 오른쪽 테이블에 있는 값이 왼쪽에 없더라도 출력하고 싶다 => RIGHT OUTER JOIN
select e.ename, e.deptno, d.dname
from emp e right outer join dept d
using(deptno);

insert into emp values( 
1000, 'kang', 'PRESIDENT', null, STR_TO_DATE ('17-11-1981','%d-%m-%Y'), 10000, null, null);

commit;

select * from emp;

select e.ename, e.deptno, d.dname
from emp e left outer join dept d
using(deptno);

select e.ename, e.deptno, d.dname
from emp e right outer join dept d
using(deptno)
UNION
select e.ename, e.deptno, d.dname
from emp e left outer join dept d
using(deptno);

select * from emp;

select 
	e.empno 사원번호, 
    e.ename 사원이름, 
    m.empno 매니저번호, 
    m.ename 매니저이름
from emp e, emp m
where e.mgr = m.empno;

-- 한번의 쿼리로 결과를 얻을 수 없을 때가 있다.
-- 예) smith라는 사람이 속한 부서의 평균 급여
select deptno from emp where ename = 'smith';
select avg(sal) from emp where deptno = 20;

select avg(sal) 
from emp 
where deptno = (select deptno from emp where ename = 'smith');

select ename, sal from emp
where sal > (select sal from emp where ename = 'SCOTT');

select ename, sal from emp
where sal < (select AVG(sal) from emp);

select ename, hiredate from emp
where hiredate = (select MIN(hiredate) from emp);

-- 부서이름이 SALES인 사원의 정보
select * from emp
where deptno = (select deptno from dept where dname = 'SALES');

-- 서브쿼리의 결과가 single row가 아니고 multi row인 경우!

-- 부서별 평균 급여보다 더 적게 받는 사원
-- sal > 20, 30, 40 이렇게는 안된다.
select deptno, ename, sal from emp
where sal < (
	select avg(sal) from emp group by deptno
); # 에러발생

-- 서브쿼리의 결과값이 여러개이므로, = > < 등의 연산자 수행이 되지 않는다.
-- IN, ANY, ALL

-- IN = OR의 결합 -> sal = first row OR second row OR ...
-- sal IN (10000, 2850, 3000, 5000, 3000)
select deptno, ename, sal from emp
where sal IN (select MAX(sal) from emp group by deptno); # 각 부서별 최대 급여과 같은 급여를 받고 있는 직원

select deptno, ename, sal from emp
where sal IN (select AVG(sal) from emp group by deptno); # 각 부서별 평균 급여와 같은 급여를 받고 있는 직원

-- IN : OR 결합
-- ANY: OR 결합 (=: IN과 동일하다, >: 최소값보다 크다, <: 최대값보다 작다, >=, <=, <>: NOT IN과 동일하다)
-- sal > ANY (1000, 2000, 3000) => sal > 1000 or sal > 2000 or sal > 3000
-- ALL: AND 결합 (=: 값이 하나가 아니면 오류 발생, >: 최대값보다 크다, <: 최소값보다 작다. >=, <=, <>: 값이 하나가 아니면 오류가 발생)
-- sal > ALL (1000, 2000, 3000) = sal > 1000 and sal > 2000 and sal > 3000

select * from emp;

-- 특정 부서를 지정
select ename, sal, deptno
from emp
where sal > (select avg(sal) from emp where deptno = 10);

-- 내가 속한 부서의 평균급여보다 많이 받는 사람의 정보
select o.ename, o.sal, o.deptno
from emp o
where o.sal > (select avg(i.sal) from emp i where i.deptno = o.deptno);

select deptno, ename, sal
from emp
where (deptno, sal) IN (
	select deptno, MAX(sal)
    from emp
    group by deptno
);

select deptno, MAX(sal)
from emp
group by deptno;

select e.deptno, e.empno, e.ename, e.sal
from emp e
join (select deptno, MAX(sal) max_sal from emp group by deptno) m
on e.deptno = m.deptno and e.sal = m.max_sal;

select deptno, MAX(sal) max_sal from emp group by deptno;

-- EXISTS 있으면 true, 없으면 false를 반환한다.
# select 1은 참/거짓을 판별하기 위해 주로 사용한다.
select e.empno, e.ename
from emp e
where EXISTS (
	select 1
    from emp s
    where s.mgr = e.empno);
    
    select e.empno, e.ename
from emp e
where NOT EXISTS (
	select 1
    from emp s
    where s.mgr = e.empno);
    
-- 테스트용 테이블
CREATE TABLE A (name INT);
CREATE TABLE B (name INT);

INSERT INTO A VALUES (1), (2), (3);
INSERT INTO B VALUES (2), (3), (4);

select * from A;
select * from B;

-- 합집합 (중복X)
select name from A
UNION
select name from B;

-- 합집합 (중복O)
select name from A
UNION ALL
select name from B;

-- INTERSECT (교집합)
select A.name
from A join B ON A.name = B.name;

-- MINUS 차집합
select name from A
where name NOT IN (
	select name from B
);

-- RANK(), 함수 OVER 부분에서 기준을 정한다
select
	sal,
    ename,
    RANK() OVER(order by sal DESC) AS ranking
from emp;

select
	deptno,
    ename,
    sal,
    RANK() OVER(partition by deptno order by sal DESC) AS dept_rank
from emp;

-- DENSE_RANK : 동순위 건너뛰지 않는다
select
	sal,
    ename,
    DENSE_RANK() OVER(order by sal DESC) AS ranking
from emp;

-- ROW_NUMBER
select
	ROW_NUMBER() OVER(order by sal DESC) AS row_num,
    ename,
    sal
from emp;

-- 학생(id, name, age, email, created_date)
-- 테이블 이름은 복수로 사용하는 것이 일반적이다.
CREATE TABLE students (
	id int primary key auto_increment, # 기본키 (반드시 설정해야 한다.)
    name varchar(50) NOT NULL,
    age int,
    email varchar(100) UNIQUE,
    created_date DATETIME DEFAULT current_timestamp
    -- TIMEZONE을 가진 것은 timestamp, DATETIME은 TIMEZONE을 가지고 있지 않다.
);

select job from emp;
desc emp;
desc students;

-- products (id, name, price, reg_date)
CREATE TABLE products (
	id int primary key auto_increment,
    name varchar(30) NOT NULL,
    price int,
    reg_date datetime);
    
desc products;

-- 데이터 삽입
-- insert into 테이블 명(컬럼명..) values (값..); 앞에 나열된 순서대로 값이 나열되어야 한다.
-- insert into 테이블 명 values (값..); 컬럼명이 생략되면, desc 테이블명에서 나온 순서대로 모든 값이 나열되어야 한다.

insert into products (name, price) values('pen', 3000);
insert into products (name, price) values(3000); # 오류 발생: name은 NOT NULL로 설정되어 있기 때문에 비워둘 수 없다.
insert into products values ('pen', 3000); # 오류 발생: 컬럼명을 생략하려면, 테이블에 존재하는 모든 컬럼에 대해 값을 나열해야 한다.

select * from products;