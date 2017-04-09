DROP TABLE IF EXISTS GANG.Article;

create table GANG.Article(
	`Article_id` bigint(20) Not Null auto_increment primary Key,
    `title` varchar(100) Not Null,
    `content` longText Not Null,
    `createdAt` dateTime Not Null,
    `createdBy` varchar(50) Not Null,
    `modifiedAt` dateTime Not Null,
    `modifiedBy` varchar(50) Not Null
);

DROP TABLE IF EXISTS GANG.Comment;

create Table GANG.Comment(
	`Comment_id` bigint(20) Not Null auto_increment primary key,
    `content` varchar(200) NOt Null,
    `createdAt` dateTime Not Null,
    `createdBy` varchar(50) Not Null,
    `article_id` long Not Null
);

DROP TABLE IF EXISTS GANG.feedback;

create Table GANG.feedback(
	`Feedback_id` bigint(20) Not Null auto_increment primary Key,
    `content` varchar(200) Not Null,
    `createdAt` dateTime Not Null,
    `createdBy` varchar(50) NOt Null,
    `name` varchar(200) Not Null,
    `password` varchar(256) NOT NULL
);

DROP TABLE IF EXISTS GANG.feedback_comment;

create table GANG.feedback_comment(
	`feedback_comment_id` bigint(20) Not Null auto_increment primary Key,
    `content` varchar(200) NOt Null,
    `createdAt` dateTime Not Null,
    `createdBy` varchar(50) Not Null,
    `feedback_id` bigint(20) Not Null
);