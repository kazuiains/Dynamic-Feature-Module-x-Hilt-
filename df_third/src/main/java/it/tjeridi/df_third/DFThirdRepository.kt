package it.tjeridi.df_third

import android.util.Log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

interface DFThirdRepository {
    fun startCounter(): Flow<String>
}

class DFThirdRepositoryImpl @Inject constructor() : DFThirdRepository {
    private var counter = 1L

    override fun startCounter(): Flow<String> = flow {
        while (true) {
            counter++
            emit("Second screen timer: $counter")
            delay(1000)
            Log.i("COMPNAVILOG", "Timer: $counter. Repository: ${this@DFThirdRepositoryImpl}")
        }
    }
}