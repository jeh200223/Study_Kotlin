package com.lion.repository

import com.lion.util.Value
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

class ProductRepository {
    companion object {
        fun getProductInfo():MutableList<MutableMap<String,Any>>{
            var productList = mutableListOf<MutableMap<String,Any>>()

            val file = File(Value().file_name2)

            if (file.exists()){
                val fileInputStream = FileInputStream(Value().file_name2)
                val objectInputStream = ObjectInputStream(fileInputStream)

                productList = objectInputStream.readObject() as MutableList<MutableMap<String, Any>>

                objectInputStream.close()
                fileInputStream.close()
            }
            return productList
        }

        fun saveProductInfo(productList: MutableList<MutableMap<String,Any>>){
            val fileOutputStream = FileOutputStream(Value().file_name2)
            val objectOutputStream = ObjectOutputStream(fileOutputStream)

            objectOutputStream.writeObject(productList)

            objectOutputStream.flush()
            objectOutputStream.close()
            fileOutputStream.close()
        }

        fun deleteProductInfoByName(inputName:String){
            val productList = getProductInfo()

            productList.removeAll {
                if (inputName == it["productName"]) {
                    true
                } else {
                    false
                }
            }

            saveProductInfo(productList)
        }

        fun deleteProductInfoByCompany(inputCompany:String){
            val productList = getProductInfo()

            productList.removeAll {
                if (inputCompany == it["productCompany"]) {
                    true
                } else {
                    false
                }
            }

            saveProductInfo(productList)
        }
    }
}