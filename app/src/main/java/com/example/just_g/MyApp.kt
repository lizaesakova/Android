package com.example.just_g

import android.app.Application
import android.util.Log
import com.example.just_g.database.AppDatabase

class MyApp : Application() {
    lateinit var database: AppDatabase

    override fun onCreate() {
        super.onCreate()
        database = AppDatabase.getDatabase(this)
        Log.d("MyApp", "Дб инит: ${database.openHelper.databaseName}")
    }
}
