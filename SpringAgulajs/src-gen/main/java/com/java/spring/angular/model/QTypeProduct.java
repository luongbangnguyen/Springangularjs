package com.java.spring.angular.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QTypeProduct is a Querydsl query type for TypeProduct
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTypeProduct extends EntityPathBase<TypeProduct> {

    private static final long serialVersionUID = -1824279838L;

    public static final QTypeProduct typeProduct = new QTypeProduct("typeProduct");

    public final com.java.model.QModel _super = new com.java.model.QModel(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public QTypeProduct(String variable) {
        super(TypeProduct.class, forVariable(variable));
    }

    public QTypeProduct(Path<? extends TypeProduct> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTypeProduct(PathMetadata<?> metadata) {
        super(TypeProduct.class, metadata);
    }

}

