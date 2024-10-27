package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.model.MemberModel
import com.lion.model.ProductModel
import com.lion.repository.MemberRepository
import com.lion.repository.ProductRepository
import com.lion.util.CalculateMenu
import com.lion.util.MemberGrade
import com.lion.util.ProgramState
import java.util.Scanner

class CalculateMemberView(val controllerClass: ControllerClass):ViewClass() {
    val memberList = MemberRepository.getMemberInfo()
    val productList = ProductRepository.getProductInfo()
    override fun show() {
        var selectedMemberList: MutableList<MutableMap<String, Any>> = mutableListOf()
        var selectedProductList: MutableList<MutableMap<String, Any>> = mutableListOf()

        while (selectedMemberList.isEmpty() || selectedProductList.isEmpty()) {
            val inputMenu = inputMenuType()

            when (inputMenu) {
                CalculateMenu.SELECTED_MEMBER.number -> {
                    if (selectedMemberList.isNotEmpty()) {
                        println("이미 선택된 항목입니다")
                    } else {
                        showMemberInfo()
                        val memberNumber = inputMember()
                        selectedMemberList = getNumberMemberInfo(memberNumber)
                        println("회원 선택 완료")
                    }
                }
                CalculateMenu.SELECTED_PRODUCT.number -> {
                    if (selectedProductList.isNotEmpty()) {
                        println("이미 선택된 항목입니다")
                    } else {
                        showProductInfo()
                        val productNumber = inputProduct()
                        selectedProductList = getNumberProductInfo(productNumber)
                        println("상품 선택 완료")
                    }
                }
                else -> {
                    println("유효하지 않은 번호입니다")
                }
            }
        }

        calculateDiscount(selectedMemberList, selectedProductList)
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }

    private fun inputMenuType():Int{
        val scanner = Scanner(System.`in`)
        println()
        println("메뉴를 선택해주세요")
        println("1. 회원 선택")
        println("2. 상품 선택")
        print("메뉴 선택 : ")
        return scanner.nextInt()
    }

    private fun showMemberInfo(){
        memberList.forEachIndexed { index, mutableMap ->
            println()
            println("${index + 1}번째 회원")
            MemberModel().showMemberInfo(mutableMap)
        }
    }

    private fun showProductInfo(){
        productList.forEachIndexed { index, mutableMap ->
            println()
            println("${index + 1}번째 상품")
            ProductModel().showProductInfo(mutableMap)
        }
    }

    private fun inputMember():Int{
        val scanner = Scanner(System.`in`)
        println()
        print("회원의 번호를 선택해주세요 : ")
        return scanner.nextInt()
    }

    private fun inputProduct():Int{
        val scanner = Scanner(System.`in`)
        println()
        print("상품의 번호를 선택해주세요 : ")
        return scanner.nextInt()
    }

    private fun getNumberMemberInfo(inputNumber:Int):MutableList<MutableMap<String,Any>>{
        val selectedMemberList = mutableListOf<MutableMap<String,Any>>()

        memberList.forEachIndexed { index, mutableMap ->
            if (inputNumber == index + 1) {
                selectedMemberList.add(mutableMap)
            }
        }
        return selectedMemberList
    }

    private fun getNumberProductInfo(inputNumber:Int):MutableList<MutableMap<String,Any>>{
        val selectedProductList = mutableListOf<MutableMap<String,Any>>()

        productList.forEachIndexed { index, mutableMap ->
            if (inputNumber == index + 1) {
                selectedProductList.add(mutableMap)
            }
        }

        return selectedProductList
    }

    private fun calculateDiscount(
        memberMap:MutableList<MutableMap<String,Any>>,
        productMap:MutableList<MutableMap<String,Any>>) {

        var getmemberGrade = ""
        var getmemberName = ""
        var getproductName = ""
        var getproductPrice = 0
        var discountPrice = 0
        var resultPrice = 0
        var discountPercent = 0.0

        memberMap.forEach { mutableMap ->
            getmemberName = mutableMap["memberName"].toString()
            getmemberGrade = mutableMap["memberGrade"].toString()
            return@forEach
        }

        productMap.forEach { mutableMap ->
            getproductName = mutableMap["productName"].toString()
            getproductPrice = mutableMap["productPrice"] as Int
            return@forEach
        }

        when(getmemberGrade){
            MemberGrade.BRONZE.str -> {
                discountPercent = 0.01
                discountPrice = (getproductPrice * discountPercent).toInt()
                resultPrice = getproductPrice - discountPrice
            }
            MemberGrade.SILVER.str -> {
                discountPercent = 0.05
                discountPrice = (getproductPrice * discountPercent).toInt()
                resultPrice = getproductPrice - discountPrice
            }
            MemberGrade.GOLD.str -> {
                discountPercent = 0.07
                discountPrice = (getproductPrice * discountPercent).toInt()
                resultPrice = getproductPrice - discountPrice
            }
            MemberGrade.PLATINUM.str -> {
                discountPercent = 0.1
                discountPrice = (getproductPrice * discountPercent).toInt()
                resultPrice = getproductPrice - discountPrice
            }
            MemberGrade.DIAMOND.str -> {
                discountPercent = 0.15
                discountPrice = (getproductPrice * discountPercent).toInt()
                resultPrice = getproductPrice - discountPrice
            }
        }
        println()
        println("${getmemberName}회원님이 ${getproductName}을 살때 가격은 ${resultPrice}원 입니다")
        println("${getmemberGrade}등급 혜택인 ${(discountPercent * 100).toInt()}% 할인이 적용되었습니다.")
    }
}