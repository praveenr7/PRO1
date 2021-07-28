package com.colan.pro2.data.api

import com.colan.pro2.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>

}