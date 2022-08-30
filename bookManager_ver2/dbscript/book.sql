drop table book;
drop SEQUENCE seq_bid;

create SEQUENCE seq_bid
start with 1
INCREMENT By 1
nocache
nocycle
nomaxvalue;

create table Book 
(
    book_id  number  primary key,
    title varchar2(50) not null,
    author  varchar2(20) not null,
    publisher  varchar2(20) not null,
    publish_date    date not null,
    price NUMBER not null
    );
--    
-- COMMENT ON COLUMN Book.book_id IS 'id';   
-- COMMENT ON COLUMN Book.title IS '책제목';   
-- COMMENT ON COLUMN Book.author IS '저자명';   
-- COMMENT ON COLUMN Book.publisher IS '출판사';   
-- COMMENT ON COLUMN Book.publish_date IS '출판날짜';   
-- COMMENT ON COLUMN Book.price IS '가격';   
    
insert into book values(seq_bid.nextval, '레이건 죽이기', '빌 오라일리', '홀트', '2009-12-25', 5900);    
insert into book values(seq_bid.nextval, '토마스 제퍼슨과 트리폴리의 해적들', '킬미드', '센티넬', '2008-08-25', 7900);   
insert into book values(seq_bid.nextval, '세상과 나 사이', '타네이시 코츠', '스피겔', '2019-11-15', 9900);   
insert into book values(seq_bid.nextval, '만약에?', '랜들 먼로', '휴톤 미플린', '2021-08-29', 15900);   
insert into book values(seq_bid.nextval, '트러블메이커', '레아 레미니', '밸런타인', '2011-12-25', 3900);   
insert into book values(seq_bid.nextval, '무기력한 아메리카', '트럼프', '트레숄드', '2014-03-25', 25900);   
commit;

    