-- 책 (isbn, 제목, 지은이, 가격, 발행일)
create table books (
	# id int primary key auto_increment, 실무에서는 이런 식으로 의미 없는 값을 primary key로 사용하는 경우가 더 많다. isbn과 같은 중요 값은 not null, unique 등으로 할당하면 된다.
	isbn varchar(20) primary key,
    title varchar(255) NOT NULL,
    author varchar(50) NOT NULL,
    price int NOT NULL check(price > 0),
    publication_date date NOT NULL,
    created_at datetime default current_timestamp
); # engine=InnoDB default charset=utf8mb4;
-- MySQL은 데이터를 저장/조회하는 방식(=엔진)을 여 개 지원하는데, 그 중 하나이다. MySQL 5.5 이후부터는 기본 스토리지 엔진이므로 생략 가능하다.
-- dtf8mb4은 utf-8의 확장형으로, 설정할 경우 이모지까지 사용이 가능하다. 최신 MySQL에서는 사실상 utf8mb4가 표준이다.

insert into books (isbn, title, author, price, publication_date)
values ('123-111', 'Java', 'KIM', 15000, '2020-05-13');

insert into books
values ('123-112', 'Spring', 'Park', '18000', '2022-07-11', now());

insert into books
values ('123-113', 'SpringBook', 'Lee', '22000', '2021-02-22', now());

insert into books
values ('123-114', 'sql', 'Hong', '12000', '2024-07-26', now());

insert into books (isbn, title, author, price, publication_date)
values ('123-115', 'JPA', 'Jang', 24000, '2019-11-16');

select * from books;

-- 수정
-- UPDATE 테이블명 SET 컬럼명 = '수정할 값', 컬럼명 = '수정할 값' WHERE 조건
-- WHERE 절 없이 사용하면 모든 데이터를 수정
UPDATE books SET title = 'SQL' WHERE isbn = '123-114';

-- 삭제
-- DELETE FROM 테이블명 WHERE 조건
DELETE FROM books WHERE isbn = '123-115';

-- 인덱스 생성
create index books_author_idx
on books(author);
-- 인덱스 확인
show index from books;
-- 인덱스 삭제
alter table books
drop index books_author_idx;

explain select * from books where author = 'KIM';

select @@autocommit;
set autocommit = 1; # 1이 ON, 0이 OFF

insert into a values (30);
select * from A;

commit;

-- 오류없이 클라이언트가 종료될 때 .. commit 자동 실행
-- DML 외 다른 명령이 수행되면, commit
-- 트랜잭션 개념이 중요

-- 테이블 수정
ALTER table a
add column updated_date timestamp null;

select * from A;