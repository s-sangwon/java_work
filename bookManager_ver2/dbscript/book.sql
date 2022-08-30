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
-- COMMENT ON COLUMN Book.title IS 'å����';   
-- COMMENT ON COLUMN Book.author IS '���ڸ�';   
-- COMMENT ON COLUMN Book.publisher IS '���ǻ�';   
-- COMMENT ON COLUMN Book.publish_date IS '���ǳ�¥';   
-- COMMENT ON COLUMN Book.price IS '����';   
    
insert into book values(seq_bid.nextval, '���̰� ���̱�', '�� �����ϸ�', 'ȦƮ', '2009-12-25', 5900);    
insert into book values(seq_bid.nextval, '�丶�� ���۽��� Ʈ�������� ������', 'ų�̵�', '��Ƽ��', '2008-08-25', 7900);   
insert into book values(seq_bid.nextval, '����� �� ����', 'Ÿ���̽� ����', '���ǰ�', '2019-11-15', 9900);   
insert into book values(seq_bid.nextval, '���࿡?', '���� �շ�', '���� ���ø�', '2021-08-29', 15900);   
insert into book values(seq_bid.nextval, 'Ʈ�������Ŀ', '���� ���̴�', '�뷱Ÿ��', '2011-12-25', 3900);   
insert into book values(seq_bid.nextval, '������� �Ƹ޸�ī', 'Ʈ����', 'Ʈ�����', '2014-03-25', 25900);   
commit;

    