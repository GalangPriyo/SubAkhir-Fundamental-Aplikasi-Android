package com.dicoding.githubuserfinal.adapter

import com.dicoding.githubuserfinal.datasource.UserResponse

interface OnItemClickCallback {
    fun onItemClicked(user: UserResponse)
}