package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.model.ProductModel
import com.lion.repository.ProductRepository
import com.lion.util.ProgramState
import com.lion.util.ToolClass
import java.util.Scanner

class SearchProductView(val controllerClass: ControllerClass):ViewClass() {
    val productList = ProductRepository.getProductInfo()
    override fun show() {
        val chk1 = ToolClass.checkProductExist()

        if (chk1 == false) {
            println()
            println("등록된 상품정보가 없습니다.")
        } else {
            val inputProductName = inputSearchProductName()
            val chk2 = checkInputProductNameExist(inputProductName)

            if (chk2 == false) {
                println()
                println("입력하신 상품의 정보가 없습니다.")
            } else {
                val searchProductInfo = getSearchProductInfo(inputProductName)
                searchProductInfo.forEach { mutableMap ->
                    ProductModel().showProductInfo(mutableMap)
                }
                val nameCount = productList.count { it["productName"] == inputProductName}
                println()
                println("${inputProductName}개수 : ${nameCount}개")
            }
        }
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }

    private fun inputSearchProductName():String{
        val scanner = Scanner(System.`in`)
        println()
        print("검색하실 상품의 이름을 입력해주세요 : ")
        return scanner.next()
    }

    private fun checkInputProductNameExist(inputName:String):Boolean{
        var chk1 = false

        productList.forEach { mutableMap ->
            if (inputName == mutableMap["productName"]){
                chk1 = true
                return@forEach
            }
        }
        return chk1
    }

    private fun getSearchProductInfo(inputName:String):MutableList<MutableMap<String,Any>>{
        val searchProductList = mutableListOf<MutableMap<String,Any>>()

        productList.forEach { mutableMap ->
            if (inputName == mutableMap["productName"]){
                searchProductList.add(mutableMap)
            }
        }
        return searchProductList
    }
}