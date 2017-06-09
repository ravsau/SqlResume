
select * from UserInfo;
drop schema if exists Resume;
create schema Resume;
use Resume;


create table UserInfo(
UserID int auto_increment,
FirstName varchar(50),
LastName varchar(50),
Email varchar(255),
Education varchar(255),
WorkExperience varchar(255),
Skill varchar(255),
primary key (UserID)
);







