package com.gang.domain.FeedBack;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QFeedBack is a Querydsl query type for FeedBack
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFeedBack extends EntityPathBase<FeedBack> {

    private static final long serialVersionUID = -2034933006L;

    public static final QFeedBack feedBack = new QFeedBack("feedBack");

    public final com.gang.domain.commons.QCreated _super = new com.gang.domain.commons.QCreated(this);

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public QFeedBack(String variable) {
        super(FeedBack.class, forVariable(variable));
    }

    public QFeedBack(Path<? extends FeedBack> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFeedBack(PathMetadata metadata) {
        super(FeedBack.class, metadata);
    }

}

