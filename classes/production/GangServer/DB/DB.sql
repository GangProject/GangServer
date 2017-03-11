create table GANG.Article(
	`Article_id` bigint(20) Not Null primary Key,
    `title` varchar(100) Not Null,
    `content` longText Not Null,
    `createdAt` dateTime Not Null,
    `createdBy` varchar(50) Not Null,
    `modifiedAt` dateTime Not Null,
    `modifiedBy` varchar(50) Not Null
);

create Table GANG.Comment(
	`Comment_id` bigint(20) Not Null primary key,
    `content` varchar(200) NOt Null,
    `createdAt` dateTime Not Null,
    `createdBy` varchar(50) Not Null,
    `article_id` long Not Null
);

create Table GANG.feedback(
	`Feedback_id` bigint(20) Not Null primary Key,
    `content` varchar(200) Not Null,
    `createdAt` dateTime Not Null,
    `createdBy` varchar(50) NOt Null
);

create table GANG.feedback_comment(
	`feedback_comment_id` bigint(20) Not Null primary Key,
    `content` varchar(200) NOt Null,
    `createdAt` dateTime Not Null,
    `createdBy` varchar(50) Not Null,
    `feedback_id` bigint(20) Not Null
);