package com.example.proyecto1.ui.theme.screens

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import androidx.work.Data

class BackgroundTaskWorker(ctx: Context, params: WorkerParameters) : Worker(ctx, params) {

    override fun doWork(): Result {
        Log.d("BackgroundTaskWorker", "Tarea en segundo plano iniciada")

        // Simulación de trabajo en segundo plano
        for (i in 1..5) {
            try {
                Thread.sleep(1000)
                Log.d("BackgroundTaskWorker", "Trabajo $i en progreso")

                setProgressAsync(Data.Builder().putInt("progress", i).build())
            } catch (e: InterruptedException) {
                Log.e("BackgroundTaskWorker", "Trabajo interrumpido: ${e.message}")
                return Result.failure()
            }
        }

        return Result.success()
    }
}
