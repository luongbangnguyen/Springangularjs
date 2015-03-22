package com.java.spring.angular.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QTypeProduct is a Querydsl query type for TypeProduct
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTypeProduct extends EntityPathBase<TypeProduct> {

    private static final long serialVersionUID = -1824279838L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTypeProduct typeProduct = new QTypeProduct("typeProduct");

    public final com.java.model.QModelProduct _super = new com.java.model.QModelProduct(this);

    //inherited
    public final StringPath code = _super.code;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    protected QSupplier supplier;

    public QTypeProduct(String variable) {
        this(TypeProduct.class, forVariable(variable), INITS);
    }

    public QTypeProduct(Path<? extends TypeProduct> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTypeProduct(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTypeProduct(PathMetadata<?> metadata, PathInits inits) {
        this(TypeProduct.class, metadata, inits);
    }

    public QTypeProduct(Class<? extends TypeProduct> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.supplier = inits.isInitialized("supplier") ? new QSupplier(forProperty("supplier")) : null;
    }

    public QSupplier supplier() {
        if (supplier == null) {
            supplier = new QSupplier(forProperty("supplier"));
        }
        return supplier;
    }

}

