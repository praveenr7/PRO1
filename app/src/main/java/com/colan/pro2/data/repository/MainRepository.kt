package com.colan.pro2.data.repository

import com.colan.pro2.data.api.ApiHelper
import com.colan.pro2.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}