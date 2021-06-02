package com.example.androidproject_team;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

@Database(entities = {Item.class}, version = 3)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserRepository userRepository();
}
