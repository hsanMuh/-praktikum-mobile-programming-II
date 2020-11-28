package com.example.praktikum_mobile_programming_ii.DataBase.data.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.praktikum_mobile_programming_ii.DataBase.data.Dao.MahasiswaDao;
import com.example.praktikum_mobile_programming_ii.DataBase.data.model.Mahasiswa;

@Database(entities = {Mahasiswa.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract MahasiswaDao userDao();
}
