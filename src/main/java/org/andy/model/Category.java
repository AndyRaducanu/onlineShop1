package org.andy.model;

import org.andy.enums.NameCategory;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer Id;
    @Column(name = "name_category")
    private NameCategory nameCategory;


    public Category() {
    }

    public Category(NameCategory nameCategory) {
        this.nameCategory = nameCategory;
    }

    public Integer getCategoryId() {
        return Id;
    }

    public void setCategoryId(Integer categoryId) {
        this.Id = categoryId;
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
                "categoryId=" + Id +
                ", nameCategory=" + nameCategory +
                '}';
    }
}
