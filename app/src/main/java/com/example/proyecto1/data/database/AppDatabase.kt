package com.example.proyecto1.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.proyecto1.data.DAO.ServiceDao
import com.example.proyecto1.data.model.ServiceEntity

@Database(entities = [ServiceEntity::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun ServiceDao(): ServiceDao
}