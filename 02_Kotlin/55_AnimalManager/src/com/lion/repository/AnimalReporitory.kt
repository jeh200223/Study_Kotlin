package com.lion.repository

import com.lion.model.AnimalModel
import com.lion.util.Values
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

class AnimalReporitory {
    companion object {
        // 동물 종류들을 읽어오는 메서드
        fun getAnimalKind():MutableMap<Int, String>{
            // 반환할 맵
            var kindMap = mutableMapOf<Int, String>()

            // 파일이 있는지 확인한다.
            val file = File(Values.fileName)
            if(file.exists()){
                // 파일과 연결되는 스트림을 생성한다.
                val fileInputStream = FileInputStream(Values.fileName)
                val objectInputStream = ObjectInputStream(fileInputStream)
                // 읽어온다.
                kindMap = objectInputStream.readObject() as MutableMap<Int, String>
                // 파일을 닫아준다.
                objectInputStream.close()
                fileInputStream.close()
            }
            return kindMap
        }

        // 동물 종류가 담긴 맵을 파일에 저장한다.
        fun saveAnimalKind(kindMap:MutableMap<Int,String>){
            // 파일과 연결된 스트림을 생성한다.
            val fileOutputStream = FileOutputStream(Values.fileName)
            val objectOutputStream = ObjectOutputStream(fileOutputStream)
            // 객체를 쓴다.
            objectOutputStream.writeObject(kindMap)
            // 파일을 닫아운다.
            objectOutputStream.flush()
            objectOutputStream.close()
            fileOutputStream.close()
        }

        fun deleteAnimalKind(inputNumber: Int): Boolean {
            // 동물 종류를 가져온다.
            val kindMap = getAnimalKind()
            // 입력한 번호에 해당하는 동물 종류를 삭제한다.
            val isRemoved = kindMap.entries.removeAll { inputNumber == it.key }
            // 삭제된 종류와 관련된 동물 정보도 삭제한다.
            removeAnimalsByType(inputNumber)
            // 변경된 동물 종류를 파일에 저장한다.
            saveAnimalKind(kindMap)
            return isRemoved
        }

        fun removeAnimalsByType(animalType: Int) {
            // 동물 정보를 가져온다.
            val animalList = getAnimalInfo()
            // 동물 목록에서 해당 종류의 동물을 제거한다.
            val updatedList = animalList.filterNot { it.animalType == animalType }
            // 업데이트된 동물 목록 저장
            saveAnimalInfo(updatedList.toMutableList())
        }

        // 동물 정보를 삭제하는 기능
        fun deleteAnimalInfo(inputName:String){
            // 동물 정보를 가져온다.
            val animalList = getAnimalInfo()
            // 이름이 같은 객체를 제거한다.
            animalList.removeAll {
                if (inputName == it.AnimalName) {
                    // 이름이 같으면 true를 반환하여 삭제하게 한다.
                    true
                } else {
                    // 이름이 다르면 false를 반환하여 삭제되지 않게 한다.
                    false
                }
            }
            // 동물 정보를 저장한다.
            saveAnimalInfo(animalList)
        }


        // 동물 종류의 키를 업데이트하는 메서드
        fun updateKindKey(inputNumber: Int) {
            // 동물 종류를 가져온다.
            val kindMap = getAnimalKind()

            // 삭제된 키 이후의 모든 키를 가져온다
            val updateKeys = kindMap.keys.filter { it > inputNumber }

            // 해당 키들의 값을 1씩 감소시킨다.
            for (key in updateKeys) {
                // 현재 키 삭제
                val value = kindMap.remove(key)
                // 감소된 키로 값 추가
                kindMap[key - 1] = value!!
            }
            // 변경된 맵을 파일에 저장한다.
            saveAnimalKind(kindMap)
        }

        // 동물들의 정보를 읽어오는 메서드
        fun getAnimalInfo():MutableList<AnimalModel>{
            // 반환할 리스트
            var animalList = mutableListOf<AnimalModel>()

            // 파일이 있는지 확인한다.
            val file = File(Values.infoName)
            if (file.exists()) {
                // 파일과 연결되는 스트림을 생성한다.
                val fileInputStream = FileInputStream(Values.infoName)
                val objectInputStream = ObjectInputStream(fileInputStream)
                // 읽어온다.
                animalList = objectInputStream.readObject() as MutableList<AnimalModel>
                // 파일을 닫아준다.
                objectInputStream.close()
                fileInputStream.close()
            }
            return animalList
        }

        // 동물 객체가 담긴 리스를 파일에 저장한다.
        fun saveAnimalInfo(animalList:MutableList<AnimalModel>){
            // 파일과 연결된 스트림을 생성한다.
            val fileOutputStream = FileOutputStream(Values.infoName)
            val objectOutputStream = ObjectOutputStream(fileOutputStream)
            // 객체를 쓴다.
            objectOutputStream.writeObject(animalList)
            // 파일을 닫아운다.
            objectOutputStream.flush()
            objectOutputStream.close()
            fileOutputStream.close()
        }

        // 동물 정보를 저장하는 기능
        fun addAnimalInfo(animalModel: AnimalModel){
            // 동물 정보를 불러온다.
            val animalList = getAnimalInfo()
            // 동물 객체를 리스트에 담는다.
            animalList.add(animalModel)
            // 저장한다.
            saveAnimalInfo(animalList)
        }
    }
}