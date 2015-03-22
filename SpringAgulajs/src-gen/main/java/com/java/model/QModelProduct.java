package com.java.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QModelProduct is a Querydsl query type for ModelProduct
 */
@Generated("com.mysema.query.codegen.SupertypeSerializer")
public class QModelProduct extends EntityPathBase<ModelProduct> {

    private static final long serialVersionUID = 294453802L;

    public static final QModelProduct modelProduct = new QModelProduct("modelProduct");

    public final QModel _super = new QModel(this);

    public final StringPath code = createString("code");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public QModelProduct(String variable) {
        super(ModelProduct.class, forVariable(variable));
    }

    public QModelProduct(Path<? extends ModelProduct> path) {
        super(path.getType(), path.getMetadata());
    }

    public QModelProduct(PathMetadata<?> metadata) {
        super(ModelProduct.class, metadata);
    }

}

