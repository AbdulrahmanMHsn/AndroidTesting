package amhsn.androidtesting.networking


import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.*

interface Service {

    @POST("auth/loginMobile")
    @FormUrlEncoded
    suspend fun normalLogin(
        @Field("phone") phoneNumber: String? = null,
        @Field("password") password: String? = null,
    ): Response<ResponseBody>

}