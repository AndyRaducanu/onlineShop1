package org.andy.repository;

import org.andy.model.Product;
import org.andy.repository.base.BaseRepositoryImpl;

public class ProductRepositoryImpl extends BaseRepositoryImpl<Product> implements ProductRepository {
    public ProductRepositoryImpl() {
        super(Product.class);
    }
}
