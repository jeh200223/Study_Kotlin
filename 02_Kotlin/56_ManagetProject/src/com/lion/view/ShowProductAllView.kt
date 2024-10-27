package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.model.ProductModel
import com.lion.repository.ProductRepository
import com.lion.util.ProgramState
import com.lion.util.ToolClass

class ShowProductAllView(val controllerClass: ControllerClass):ViewClass() {
    val productList = ProductRepository.getProductInfo()
    override fun show() {
        val chk1 = ToolClass.checkProductExist()

        if (chk1 == false) {
            println()
            println("등록된 상품정보가 없습니다.")
        } else {
            showProductInfoAll()
            val productAllCount = getProductAllData()
            showProductAllData(productAllCount)
        }
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }

    private fun showProductInfoAll(){
        productList.forEach { mutableMap ->
            ProductModel().showProductInfo(mutableMap)
        }
    }

    private fun getProductAllData():Int{
        return productList.size
    }

    private fun showProductAllData(productCount:Int){
        println()
        println("전체 상품의 수 : ${productCount}개")
    }
}