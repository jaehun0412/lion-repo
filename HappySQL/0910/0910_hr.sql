SHOW TABLES;
SELECT USER();
SELECT * FROM countries;

DESC employees;

SELECT * FROM countries;

SELECT
	first_name AS 이름,
    hire_date AS 입사일,
    salary AS 급여
FROM employees;

SELECT CONCAT('Hello', ' ', 'MySQL');
SELECT CONCAT(first_name, ' ', last_name) AS full_name
FROM employees;

-- 괄호에 따라 우선순위가 정해진다.
SELECT * FROM employees
WHERE (department_id = 90 OR department_id = 100)
AND salary >= 10000;

-- AND 가 OR 보다 우선순위가 높다.
SELECT * FROM employees
WHERE department_id = 90 OR department_id = 100 AND salary >= 10000;

DESC employees;

-- 실습1
-- 모든 직원의 이름과 이메일 조회
SELECT CONCAT(first_name, ' ', last_name) 이름, email 이메일
FROM employees;

-- 급여가 15000 이상인 직원 조회
SELECT * FROM employees WHERE salary >= 15000;

-- 2005년에 입사한 직원
SELECT * FROM employees WHERE hire_date LIKE '2005%';

-- 실습2
-- 이름에 an이 포함된 직원
SELECT 
	employee_id 직원번호, 
	CONCAT(first_name, ' ', last_name) 이름, 
    email 이메일, 
    phone_number 전화번호, 
    hire_date 입사일, 
    job_id 직무, 
    salary 급여
FROM employees 
WHERE CONCAT(first_name, ' ', last_name) LIKE '%an%';

-- 이메일이 'S'로 시작하는 직원을 급여 내림차순 정렬
SELECT * FROM employees 
WHERE email LIKE 'S%'
ORDER BY salary DESC;

-- 실습3
-- 부서별 직원 수와 평균 급여
SELECT department_id 부서, COUNT(employee_id) '직원 수', AVG(salary) '평균 급여'
FROM employees
WHERE department_id IS NOT NULL
GROUP BY department_id;

-- 직원이 5명 이상인 부서만 조회
SELECT department_id 부서, COUNT(employee_id) '직원 수'
FROM employees
GROUP BY department_id
HAVING COUNT(employee_id) >= 5
ORDER BY department_id;