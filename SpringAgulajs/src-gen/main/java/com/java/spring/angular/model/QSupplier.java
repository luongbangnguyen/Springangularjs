package com.java.spring.angular.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSupplier is a Querydsl query type for Supplier
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSupplier extends EntityPathBase<Supplier> {

    private static final long serialVersionUID = -27772321L;

    public static final QSupplier supplier = new QSupplier("supplier");

    public final com.java.model.QModelProduct _super = new com.java.model.QModelProduct(this);

    //inherited
    public final StringPath code = _super.code;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    public QSupplier(String variable) {
        super(Supplier.class, forVariable(variable));
    }

    public QSupplier(Path<? extends Supplier> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSupplier(PathMetadata<?> metadata) {
        super(Supplier.class, metadata);
    }

}

