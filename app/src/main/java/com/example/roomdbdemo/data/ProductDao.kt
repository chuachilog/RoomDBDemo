package com.example.roomdbdemo.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProductDao {

    @Insert
    fun insertProduct(p : Product)

    @Query("Select * From product_table")
    fun getAll() : List<Product>

    @Query("Select * From product_table Where price < :priceRange")
    fun getPriceLessThan(priceRange:Double) : List<Product>

    @Delete
    fun delete(p:Product)

    @Query("Delete From product_table")
    fun deleteAll()

}