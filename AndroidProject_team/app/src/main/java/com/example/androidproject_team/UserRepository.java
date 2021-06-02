package com.example.androidproject_team;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserRepository {

    @Query("SELECT * FROM item")
    List<Item> findAll();

    @Query("SELECT * FROM item where uid=:uid")
    Item findById(int uid);

    @Insert
    void insert(Item item);

    @Delete
    void delete(Item item);
}
