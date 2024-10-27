package com.lion.model

import java.io.Serializable
import java.util.Scanner

class ProductModel:Serializable {
    var productName = ""
    var productPrice = 0
    var productCompany = ""

    fun inputProductInfo(scanner: Scanner):MutableMap<String, Any>{
        println()
        print("상품 회사 : ")
        productCompany = scanner.next()
        print("상품 이름 : ")
        productName = scanner.next()
        print("상품 가격 : ")
        productPrice = scanner.nextInt()

        val productMap:MutableMap<String, Any> = mutableMapOf(
            "productCompany" to productCompany,
            "productName" to productName,
            "productPrice" to productPrice)

        return productMap
    }

    fun showProductInfo(productMap : MutableMap<String, Any>){
        println()
        println("상품 회사 : ${productMap["productCompany"]}")
        println("상품 이름 : ${productMap["productName"]}")
        println("상품 가격 : ${productMap["productPrice"]}원")
    }
}