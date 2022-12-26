package com.nimesh.shop.productws.repository;

import com.nimesh.shop.productws.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,String> {

    Category findByCategoryId(String categoryId);
}
