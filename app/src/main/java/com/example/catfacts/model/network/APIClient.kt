package com.example.catfacts.model.network

import android.content.Context
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class APIClient {

    var BASE_URL:String="https://jsonplaceholder.typicode.com/"
    val getClient: ApiInterface
        get() {

            val gson = GsonBuilder()
                .setLenient()
                .create()
            val interceptor = HttpLoggingInterceptor()
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
            val client = OkHttpClient.Builder().addInterceptor(interceptor).build()

            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()

            return retrofit.create(ApiInterface::class.java)

        }

//    fun getClientWithToken(context: Context): Retrofit{
//
//    }
//    fun getClientWithToken(context: Context): Retrofit {
//        if (mRetrofitWithToken == null) {
//            mRetrofitWithToken = Retrofit.Builder()
//                .baseUrl(APIConstants.BASE_URL)
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .addConverterFactory(GsonConverterFactory.create())
//                .client(getHttpLogClientWithToken(context))
//                .build()
//        }
//        return mRetrofitWithToken!!
//    }

//    companion object {
//        fun getInstance(context: Context): ApiInterface = APIClient().getClientWithToken(context)
//            .create(ApiInterface::class.java)
//
//        const val HEADER_CACHE_CONTROL = "Cache-Control"
//        const val HEADER_PRAGMA = "Pragma"
//    }
}