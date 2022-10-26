create table Manga_HE161916
( manga_id int primary key,
 manga_name nvarchar(100),
 category_id int ,
 team_id int,
 auth nvarchar(100),
 [status] int,
 other_name nvarchar(100),
 manga_infor nvarchar(1000),
 illu_url varchar(500),
 [user_id] int,
 art nvarchar(100),
 [time] datetime,
)
go 
create table Chapter_HE161916
( manga_id int ,
 chapter_id int primary key,
 chapter_name nvarchar(100),
 page_url varchar(500),
 page_number int
)
go 
create table Team_HE161916
( team_id int primary key,
team_name nvarchar(100),
manga_id int,
logo_url varchar(500),
team_url varchar(500),
[user_id] int,
)
go
create table Rating_HE161916
(
rating_id int primary key,
manga_id int,
[user_id] int,
rating float
)
go 
create table User_HE161916
(
[user_id] int primary key,
[user_name] nvarchar(100) not null,
[user_login] varchar(100) not null,
email varchar(100) not null,
[password] varchar(100) not null,
avatar_url varchar(500)
)
create table Category_HE161916
( category_id int primary key,
category_name nvarchar(100) not null,
category_infor nvarchar(1000)
)
go
create table Comment_HE161916
(manga_id int,
[user_id] int,
comment_id int primary key,
comment_infor nvarchar(1000),
comment_time datetime,
comment_to int,
comment_from int
)
go 
create table History_HE161916
( 
history_id int primary key,
manga_id int,
chapter_id int,
[time] datetime
)

ALTER table Chapter_HE161916
Alter Column [views] bigint
ALTER table Comment_HE161916
ADD rating int
ALTER table User_HE161916
Add roll int
ALTER table Chapter_HE161916
Add chapter_number int