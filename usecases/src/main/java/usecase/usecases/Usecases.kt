package usecase.usecases

import android.arch.lifecycle.MutableLiveData
import android.arch.persistence.room.TypeConverter
import com.google.gson.Gson
import enities.entity.Coordinates

fun randomNumberGeneration() = Math.random() * 1000;

fun numberIncrementer(liveData: MutableLiveData<Int>, incrementBy: Int = 1) {
    val oldValue = liveData.value ?: 0
    liveData.postValue(oldValue + incrementBy)
}

class CoordinatesTypeConverter {

    @TypeConverter
    fun toJson(coordinates: Coordinates) = Gson().toJson(coordinates)

    fun fromJson(string: String) = Gson().fromJson(string, Coordinates::class.java)

}

fun toggleChanger(liveData: MutableLiveData<Boolean>) {
    val oldState = liveData.value ?: false
    liveData.postValue(!oldState)
}
