package com.example.proyecto1.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.proyecto1.data.dao.ServiceDao
import com.example.proyecto1.data.model.ServiceEntity

@Database(entities = [serviceEntity::class], version =1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun serviceDao(): ServiceDao
}