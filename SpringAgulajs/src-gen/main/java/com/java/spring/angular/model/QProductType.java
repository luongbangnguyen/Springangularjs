package com.java.spring.angular.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QProductType is a Querydsl query type for ProductType
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QProductType extends EntityPathBase<ProductType> {

    private static final long serialVersionUID = 561402710L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductType productType = new QProductType("productType");

    public final com.java.model.QModelProduct _super = new com.java.model.QModelProduct(this);

    //inherited
    public final StringPath code = _super.code;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    protected QSupplier supplier;

    public QProductType(String variable) {
        this(ProductType.class, forVariable(variable), INITS);
    }

    public QProductType(Path<? extends ProductType> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProductType(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProductType(PathMetadata<?> metadata, PathInits inits) {
        this(ProductType.class, metadata, inits);
    }

    public QProductType(Class<? extends ProductType> type, PathMetadata<?> metadata, PathInits inits) {
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

