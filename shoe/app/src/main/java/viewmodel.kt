import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class viewmodel : ViewModel() {





    val shoes: MutableLiveData<shoe>by lazy { MutableLiveData<shoe>() }
val msg = MutableLiveData<String>()


    public fun send(shoeobj: shoe ) {
        shoes.value=shoeobj
    }
    public fun sndmsg(txt : String){
        msg.value=txt
    }
}