import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class viewmodel : ViewModel() {





    val shoes: MutableLiveData<shoe>by lazy { MutableLiveData<shoe>() }



    public fun send(shoeobj: shoe ) {
        shoes.value=shoeobj
    }
}