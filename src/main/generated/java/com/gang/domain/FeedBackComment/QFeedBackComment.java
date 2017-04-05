package com.gang.domain.FeedBackComment;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFeedBackComment is a Querydsl query type for FeedBackComment
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFeedBackComment extends EntityPathBase<FeedBackComment> {

    private static final long serialVersionUID = -995986454L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFeedBackComment feedBackComment = new QFeedBackComment("feedBackComment");

    public final StringPath content = createString("content");

    public final com.gang.domain.FeedBack.QFeedBack feedBack;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QFeedBackComment(String variable) {
        this(FeedBackComment.class, forVariable(variable), INITS);
    }

    public QFeedBackComment(Path<? extends FeedBackComment> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFeedBackComment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFeedBackComment(PathMetadata metadata, PathInits inits) {
        this(FeedBackComment.class, metadata, inits);
    }

    public QFeedBackComment(Class<? extends FeedBackComment> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.feedBack = inits.isInitialized("feedBack") ? new com.gang.domain.FeedBack.QFeedBack(forProperty("feedBack")) : null;
    }

}

