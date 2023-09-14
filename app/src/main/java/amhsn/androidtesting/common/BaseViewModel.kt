package amhsn.androidtesting.common

import amhsn.androidtesting.networking.ApiClient
import androidx.lifecycle.ViewModel


abstract class BaseViewModel : ViewModel() {
    var apiServices = ApiClient.getApiClient()
}


