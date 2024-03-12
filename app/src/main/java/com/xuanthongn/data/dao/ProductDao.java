package com.xuanthongn.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.xuanthongn.data.model.Product;

import java.util.List;

@Dao
public interface ProductDao {
    @Query("SELECT * FROM products WHERE Id=:productId LIMIT 1")
    Product find(int productId);
    @Query("SELECT * FROM products")
    List<Product> getAll();

    @Query("SELECT * FROM products")
    List<Product> getHotProducts();

    @Query("SELECT * FROM products")
    List<Product> getNewProducts();

    @Query("SELECT * FROM products WHERE category_id=:categoryId")
    List<Product> getProductsByCategory(int categoryId);

    @Insert
    void insertAll(Product... products);

    @Delete
    void delete(Product product);
}
