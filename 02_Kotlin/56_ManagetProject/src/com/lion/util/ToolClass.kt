package com.lion.util

import com.lion.repository.MemberRepository
import com.lion.repository.ProductRepository

class ToolClass {
    companion object{
        fun checkMemberExist():Boolean{
            val memberList = MemberRepository.getMemberInfo()

            if (memberList.size == 0) {
                return false
            } else {
                return true
            }
        }

        fun checkProductExist():Boolean{
            val productList = ProductRepository.getProductInfo()

            if (productList.size == 0) {
                return false
            } else {
                return true
            }
        }
    }
}