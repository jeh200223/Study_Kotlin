package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.repository.ProductRepository
import com.lion.util.ProgramState
import com.lion.util.ToolClass
import java.util.Scanner

class DeleteProductView(val controllerClass: ControllerClass):ViewClass() {
    val productList = ProductRepository.getProductInfo()
    override fun show() {
        val chk1 = ToolClass.checkProductExist()

        if (chk1 == false) {
            println()
            println("등록된 상품정보가 없습니다.")
        } else {
            val inputProductName = inputDeleteProductName()
            val chk2 = checkInputProductNameExist(inputProductName)

            val nameCount = productList.count { it["productName"] == inputProductName}

            if (nameCount > 1) {
                if (chk2 == false) {
                    println()
                    println("입력하신 상품의 정보가 없습니다.")
                } else {
                    val inputProductCompany = inputDeleteProductCompany()
                    val chk3 = checkInputProductCompanyExist(inputProductCompany)

                    if (chk3 == false) {
                        println()
                        println("입력하신 회사의 상품 정보를 찾을 수 없습니다")
                    } else {
                        deleteProductInfoByCompany(inputProductName, inputProductCompany)
                    }
                }
            } else {
                if (chk2 == false) {
                    println()
                    println("입력하신 상품의 정보가 없습니다.")
                } else {
                    deleteProductInfoByName(inputProductName)
                }
            }
        }
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }

    private fun inputDeleteProductName():String{
        val scanner = Scanner(System.`in`)
        println()
        print("삭제할 상품의 이름을 입력해주세요 : ")
        return scanner.next()
    }

    private fun inputDeleteProductCompany():String{
        val scanner = Scanner(System.`in`)
        println()
        print("삭제할 상품의 회사를 입력해주세요 : ")
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

    private fun checkInputProductCompanyExist(inputCompany:String):Boolean{
        var chk1 = false

        productList.forEach { mutableMap ->
            if (inputCompany == mutableMap["productCompany"]){
                chk1 = true
                return@forEach
            }
        }
        return chk1
    }

    private fun deleteProductInfoByName(inputName:String){
        ProductRepository.deleteProductInfoByName(inputName)
        println()
        println("${inputName}의 정보를 삭제하였습니다.")
    }

    private fun deleteProductInfoByCompany(inputName:String, inputCompany: String){
        ProductRepository.deleteProductInfoByCompany(inputCompany)
        println()
        println("${inputName}의 정보를 삭제하였습니다.")
    }
}