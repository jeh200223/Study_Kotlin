package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.model.ProductModel
import com.lion.repository.ProductRepository
import com.lion.util.ProgramState
import java.util.Scanner

class InputProductView(val controllerClass: ControllerClass):ViewClass() {
    override fun show() {
        showInputProduct()
        val productInfo = inputProductInfo()
        saveProductInfo(productInfo)
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }

    private fun showInputProduct(){
        println()
        println("상품정보를 입력해주세요")
    }

    private fun inputProductInfo():MutableMap<String,Any>{
        val scanner = Scanner(System.`in`)
        val productModel = ProductModel().inputProductInfo(scanner)
        return productModel
    }

    private fun saveProductInfo(productMap: MutableMap<String,Any>){
        val productList = ProductRepository.getProductInfo()

        productList.add(productMap)
        ProductRepository.saveProductInfo(productList)

        println()
        println("상품 정보가 성공적으로 등록되었습니다.")
    }
}