import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class viewmodel : ViewModel() {




    val shoecomp: MutableLiveData<String>by lazy { MutableLiveData<String>() }
    val shoename: MutableLiveData<String>by lazy { MutableLiveData<String>() }
    val shoedes: MutableLiveData<String>by lazy { MutableLiveData<String>() }
    val shoesize: MutableLiveData<Float>by lazy { MutableLiveData<Float>() }
}