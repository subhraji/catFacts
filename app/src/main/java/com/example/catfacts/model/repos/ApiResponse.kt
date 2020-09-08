package com.example.catfacts.model.repos

class ApiResponse {
    var mResponse: Any? = null
    var mThrowable: Throwable? = null

    constructor(response: Any) {
        mResponse = response
        mThrowable = null
    }

    constructor(throwable: Throwable) {
        mThrowable = throwable
        mResponse = null
    }
}