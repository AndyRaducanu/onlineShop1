package org.andy.model;

import org.andy.enums.NameCategory;

public class Category {
    private Integer categoryId;
    private NameCategory nameCategory;

    public Category() {
    }

    public Category(NameCategory nameCategory) {
        this.nameCategory = nameCategory;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public NameCategory getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(NameCategory nameCategory) {
        this.nameCategory = nameCategory;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", nameCategory=" + nameCategory +
                '}';
    }
}
