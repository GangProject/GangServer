package com.gang.domain.commons;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QModified is a Querydsl query type for Modified
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QModified extends EntityPathBase<Modified> {

    private static final long serialVersionUID = -1932840309L;

    public static final QModified modified = new QModified("modified");

    public final QCreated _super = new QCreated(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final DateTimePath<java.time.LocalDateTime> modifiedAt = createDateTime("modifiedAt", java.time.LocalDateTime.class);

    public final StringPath modifiedBy = createString("modifiedBy");

    public QModified(String variable) {
        super(Modified.class, forVariable(variable));
    }

    public QModified(Path<? extends Modified> path) {
        super(path.getType(), path.getMetadata());
    }

    public QModified(PathMetadata metadata) {
        super(Modified.class, metadata);
    }

}

