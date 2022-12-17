package org.andy.repository;

import org.andy.model.Category;
import org.andy.repository.base.BaseRepositoryImpl;

public class CategoryRepositoryImpl extends BaseRepositoryImpl<Category> implements CategoryRepository {
    public CategoryRepositoryImpl() {
        super(Category.class);
    }
}
