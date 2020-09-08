package com.example.catfacts.model.repos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.catfacts.model.network.APIClient
import com.example.catfacts.model.network.ApiInterface
import com.example.catfacts.model.pojo.random_facts.RandomFacts

class RandomFactsRepository {
//    private val mDisposable = CompositeDisposable()
//    private val apiService: ApiInterface = APIClient.getInstance(context)

//    fun getPrevYearQuestions()
//            : LiveData<ApiResponse> {
//
//        val prevQtnResponse = MutableLiveData<ApiResponse>()
//        mDisposable.add(
//            apiService.getPrevYearsQtn()
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribeWith(object : DisposableSingleObserver<RandomFacts>() {
//                    override fun onSuccess(t: RandomFacts) {
//                        prevQtnResponse.postValue(ApiResponse(t))
//                    }
//
//                    override fun onError(e: Throwable) {
//                        prevQtnResponse.postValue(ApiResponse(e))
//                    }
//
//                })
//        )
//
//        return prevQtnResponse
//    }

}