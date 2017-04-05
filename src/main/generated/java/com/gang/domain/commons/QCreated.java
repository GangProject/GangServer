package com.gang.domain.commons;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCreated is a Querydsl query type for Created
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QCreated extends EntityPathBase<Created> {

    private static final long serialVersionUID = -676507930L;

    public static final QCreated created = new QCreated("created");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final StringPath createdBy = createString("createdBy");

    public QCreated(String variable) {
        super(Created.class, forVariable(variable));
    }

    public QCreated(Path<? extends Created> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCreated(PathMetadata metadata) {
        super(Created.class, metadata);
    }

}

