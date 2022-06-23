package com.binar.secondhand.kel2.data.api.service

import com.binar.secondhand.kel2.data.api.model.auth.login.PostLoginRequest
import com.binar.secondhand.kel2.data.api.model.auth.register.PostRegisterRequest
import com.binar.secondhand.kel2.data.api.model.auth.user.PutAuthRequest
import com.binar.secondhand.kel2.data.api.model.buyer.order.post.PostOrderRequest

class ApiHelper(val apiService: ApiService) {
    suspend fun postLogin(request: PostLoginRequest) = apiService.postLogin(request)

    suspend fun postRegister(request: PostRegisterRequest) = apiService.postRegister(request)

    suspend fun getAuth() = apiService.getAuth()

    suspend fun putAuth(request: PutAuthRequest) = apiService.putAuth(request)

    suspend fun getProductDetail(productId: Int) = apiService.getProductDetail(productId)
    suspend fun getUserProfile(userId: Int) = apiService.getUserProfile(userId)

    suspend fun postBuyerOrder(request: PostOrderRequest) = apiService.postBuyerOrder(request)
}