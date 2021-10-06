create table user_info(
    user_seq bigint not null auto_increment primary key comment '회원순번'
    , user_id nvarchar(60) not null unique comment '회원아이디'
    , user_name nvarchar(30) not null comment '회원이름'
    , user_pw char(60) not null comment '회원비밀번호'
    , user_auth nvarchar(20) comment '회원권한'
    , user_dlt_yn char(1) default 'N' comment '회원여부'
) comment  '회원';

create table board(
    board_seq bigint not null auto_increment primary key comment '게시판순번'
    , board_title varchar(100) not null comment '게시글제목'
    , board_content text comment '게시글내용'
    , file_path nvarchar(200) comment '첨부파일'
    , reg_id nvarchar(60) not null comment '게시글작성자'
    , reg_dtm timestamp default current_timestamp comment '게시글작성일시'
    , last_upt_dtm timestamp default current_timestamp on update current_timestamp comment '마지막게시글수정일시'
    , dlt_yn char(1) default 'N' comment '삭제여부'
) comment '게시판';

create table board_like(
    like_seq bigint not null auto_increment primary key comment '좋아요순번'
    , user_seq bigint not null comment '회원순번'
    , board_seq bigint not null comment '게시글순번'
) comment '게시글좋아요';

create table board_reply(
    reply_seq bigint not null  auto_increment primary key comment '댓글순번'
    , reply_origin_seq bigint comment '원댓글번호'
    , board_seq bigint not null comment '게시글순번'
    , reply_reg_id nvarchar(60) not null comment '댓글작성자'
    , reply_reg_dtm timestamp default current_timestamp comment '댓글작성일시'
    , last_upt_dtm timestamp default current_timestamp on update current_timestamp comment '마지막댓글수정일시'
    , reply_dlt_yn char(1) default 'N' comment '댓글삭제여부'
) comment '게시글댓글';

