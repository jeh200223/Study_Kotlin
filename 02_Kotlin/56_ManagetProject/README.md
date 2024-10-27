멤버쉽관리&할인률 계산 프로그램

1. 회원등록 : 회원이름,이메일,등급
2. 회원삭제
3. 회원전체보기
4. 회원검색
5. 회원별 등급 조정 : 회원의 등급을 따로 조정할수있음
6. 상품등록: 상품이름,상품가격
7. 상품삭제
8. 상품전체보기
9. 상품검색
10. 회원별 상품할인률 계산



#회원별 상품할인률 계산#
1. 회원선택
2. 상품선택
   ----->이 회원이 이상품을 샀을때 할인률 보여주고 상품가격 보여주기

출력예시)

A회원이 B상품을 살때 가격은
xxx원입니다
(골드등급, 1%할인 적용)

C회원이 D상품을 살때 가격은
xxx원입니다
(플랜티넘등급, 2%할인적용)

```
1. 메인메뉴 상태
사용자가 선택한 메뉴 번호
2. 회원등록 상태
회원 이름
이메일
등급
3. 회원삭제 상태
등록한 회원이 있는지 여부
사용자가 입력한 회원의 이름
입력한 회원이 있는지 여부
4. 회원전체보기 상태
등록한 회원이 있는지 여부
전체 회원의 수
이름
이메일
등급
5. 회원검색 상태
등록한 회원이 있는지 여부
사용자가 입력한 회원의 이름
사용자가 입력한 회원이 있는지 여부
이름
이메일
등급
6. 회원별 등급 조정 상태
등록한 회원이 있는지 여부
사용자가 입력한 회원의 이름
사용자가 입력한 회원이 있는지 여부
이름
등급
7. 상품등록 상태
상품이름
상품가격
8. 상품삭제 상태
등록한 상품이 있는지 여부
사용자가 입력한 상품의 이름
사용자가 입력한 상품이 있는지 여부
9. 상품전체보기 상태
등록한 상품이 있는지 여부
전체 상품의 수
10. 상품검색 상태
등록한 상품이 있는지 여부
사용자가 입력한 상품의 이름
사용자가 입력한 상품이 있는지 여부
상품이름
상품가격
11. 회원별 상품할인률 계산 상태
사용자가 선택한 회원 번호
사용자가 선택한 상품 번호
```

### 각 상태별로 필요한 기능들을 정리한다.

```
1. 메인메뉴 상태
사용자에게 메뉴 번호를 입력받는 기능
2. 회원등록 상태
회원 이름 입력받는 기능
이메일 입력받는 기능
등급 입력받는 기능
3. 회원삭제 상태
등록한 회원이 있는지 확인하는 기능
삭제할 회원의 이름 입력받는 기능
입력한 회원이 있는지 검사하는 기능
삭제하는 기능
4. 회원전체보기 상태
등록된 회원이 있는지 확인하는 기능
전체 회원의 수를 구하는 기능
회원들의 정보를 출력하는 기능
5. 회원검색 상태
등록한 회원이 있는지 확인하는 기능
검색하고자 하는 회원의 이름을 입력받는 기능
검색하고자 하는 회원이 있는지 검사하는 기능
검색된 회원의 정보를 출력하는 기능
6. 회원별 등급 조정 상태
등록한 회원이 있는지 확인하는 기능
검색하고자 하는 회원의 이름을 입력받는 기능
검색하고자 하는 회원이 있는지 검사하는 기능
검색된 회원의 정보를 출력하는 기능
등급을 입력받는 기능
7. 상품등록 상태
상품이름 입력받는 기능
상품가격 입력받는 기능
8. 상품삭제 상태
등록한 상품이 있는지 확인하는 기능
삭제할 상품의 이름 입력받는 기능
입력한 상품이 있는지 검사하는 기능
삭제하는 기능
9. 상품전체보기 상태
등록된 상품이 있는지 확인하는 기능
전체 상품의 수를 구하는 기능
상품들의 정보를 출력하는 기능
10. 상품검색 상태
등록한 상품이 있는지 확인하는 기능
검색하고자 하는 상품의 이름을 입력받는 기능
검색하고자 하는 상품이 있는지 검사하는 기능
검색된 상품의 정보를 출력하는 기능
11. 회원별 상품할인률 계산 상태
사용자가 선택한 회원 번호 입력받는 기능
사용자가 선택한 상품 번호 입력받는 기능
회원등급에 따라서 상품이 할인되는 기능
```

### 뽑아낸 기능 선별

``` 
1. 메인메뉴 상태
사용자에게 메뉴 번호를 입력받는 기능 -> View
2. 회원등록 상태
회원 정보를 입력받는 기능 -> View
회원 정보 저장 -> Repository
3. 회원삭제 상태
등록된 회원이 있는지 확인하는 기능 -> util
삭제할 회원의 이름 입력받는 기능 -> View
입력한 회원이 있는지 검사하는 기능 -> Repository
삭제하는 기능
4. 회원전체보기 상태
등록된 회원이 있는지 확인하는 기능 -> util
전체 회원 정보를 가져오는 기능 -> Repository
전체 회원의 수를 구하는 기능 -> View
회원들의 정보를 출력하는 기능 -> View
5. 회원검색 상태
등록된 회원이 있는지 확인하는 기능 -> util
검색하고자 하는 회원의 이름을 입력받는 기능 -> View
검색하고자 하는 회원이 있는지 검사하는 기능 -> Repository
검색된 회원의 정보를 출력하는 기능 -> View
6. 회원별 등급 조정 상태
등록된 회원이 있는지 확인하는 기능 -> util
검색하고자 하는 회원의 이름을 입력받는 기능 -> View
검색하고자 하는 회원이 있는지 검사하는 기능 -> Repository
검색된 회원의 정보를 출력하는 기능 -> View
등급을 입력받는 기능 -> View
등급을 업데이트하는 기능 -> Repository
7. 상품등록 상태
상품정보를 입력받는 기능 -> View
상품 정보 저장 -> Repository
8. 상품삭제 상태
등록된 상품이 있는지 확인하는 기능 -> util
삭제할 상품의 이름 입력받는 기능 -> View
입력한 상품이 있는지 검사하는 기능 -> Repository
삭제하는 기능 -> Repository
9. 상품전체보기 상태
등록된 상품이 있는지 확인하는 기능 -> util
전체 상품 정보를 가져오는 기능 -> Repository
전체 상품의 수를 구하는 기능 -> View
상품들의 정보를 출력하는 기능 -> View
10. 상품검색 상태
등록된 상품이 있는지 확인하는 기능 -> util
검색하고자 하는 상품의 이름을 입력받는 기능 -> View
검색하고자 하는 상품이 있는지 검사하는 기능 -> Repository
검색된 상품의 정보를 출력하는 기능 -> View
11. 회원별 상품할인률 계산 상태
사용자가 선택한 회원 번호 입력받는 기능 -> View
사용자가 선택한 상품 번호 입력받는 기능 -> View
회원등급에 따라서 상품이 할인되는 기능 -> Repository

파일저장은 2개
member.dat, product.dat
```

### 패키지를 만든다.
- com.lion.main
- com.lion.view
- com.lion.util
- com.lion.model
- com.lion.controller
- com.lion.repository

### 클래스파일들을 만들어준다.
- com.lion.main
Main
- com.lion.view
ShowMainMenuView
InputMemberView - ViewClass 상속
DeleteMemberView - ViewClass 상속
ShowMemberAllView - ViewClass 상속
SearchMemberView - ViewClass 상속
UpdateGradeMemberView - ViewClass 상속
InputProductView - ViewClass 상속
DeleteProductView - ViewClass 상속
ShowProductAllView - ViewClass 상속
SearchProductView - ViewClass 상속
CalculateMemberView - ViewClass 상속
ExitProgramView
ViewClass
- com.lion.util
Value
ToolClass
- com.lion.model
MemberModel
ProductModel
- com.lion.controller
ControllerClass
- com.lion.repository
MemberRepository
ProductRepository

### 클래스 파일에 필여힌 기능들을 메서드로 만든다.
- com.lion.main
  Main
main
- com.lion.view
  ShowMainMenuView
showMainMenu
setState
  InputMemberView - ViewClass 상속
showInputMember
inputMemberInfo
  DeleteMemberView - ViewClass 상속
showDeleteMember
deleteInputMember
DeleteMember
  ShowMemberAllView - ViewClass 상속
showMemberAll
  SearchMemberView - ViewClass 상속
showSearchMember
inputSearchMember
  UpdateGradeMemberView - ViewClass 상속
showSearchMember
inputSearchMember
updateGrade
  InputProductView - ViewClass 상속
showInputProduct
inputProductInfo
  DeleteProductView - ViewClass 상속
showDeleteProduct
deleteInputProduct
DeleteProduct
  ShowProductAllView - ViewClass 상속
showProductAll
  SearchProductView - ViewClass 상속
showSearchProduct
inputSearchProduct
  CalculateMemberView - ViewClass 상속
inputMember
inputProduct
showResult
  ExitProgramView
exitProgram
  ViewClass
show
- com.lion.util
  Value
programState
menuState
member.dat
product.dat
  ToolClass
checkMemberExist
checkProductExist
- com.lion.model
  MemberModel
inputMemberInfo
ShowMemberInfo
  ProductModel
inputProductInfo
ShowProductInfo
- com.lion.controller
  ControllerClass
doController
- com.lion.repository
  MemberRepository
addMemberInfo
saveMemberInfo
getMemberInfo
deleteMemberInfo
searchMemberInfo
updateMemberGrade
  ProductRepository
addProductInfo 
saveProductInfo
getProductInfo
deleteProductrInfo
searchProductInfo

### 정리한대로 클래스들을 만들어준다.

### Value파일에 분기할 프로그램 상태들을 만들어준다.
```kotlin
enum class ProgramState(var number: Int, var str:String){
    // 메인메뉴 상태
    STATE_SHOW_MAIN_MENU(1, "메인메뉴 상태"),
    // 회원등록 상태
    STATE_INPUT_MEMBER_INFO(2, "회원등록 상태"),
    // 회원삭제 상태
    STATE_DELETE_MEMBER_INFO(3, "회원삭제 상태"),
    // 회원전체보기 상태
    STATE_SHOW_MEMBER_INFO_ALL(4, "회원전체보기 상태"),
    // 회원검색 상태
    STATE_SEARCH_MEMBER_INFO(5, "회원검색 상태"),
    // 회원별 등급 조정 상태
    STATE_UPGRADE_MEMBER_GRADE(6, "회원별 등급 조정 상태"),
    // 상품등록 상태
    STATE_INPUT_PRODUCT_INFO(7, "상품등록 상태"),
    // 상품삭제 상태
    STATE_DELETE_PRODUCT_INFO(8, "상품삭제 상태"),
    // 상품전체보기 상태
    STATE_SHOW_PRODUCT_INFO_ALL(9, "상품전체보기 상태"),
    // 상품검색 상태
    STATE_SEARCH_PRODUCT_INFO(10, "상품검색 상태"),
    // 회원별 상품할인률 계산 상태
    STATE_CALCULATE_MEMBER_PRODUCT(11, "회원별 상품할인률 계산 상태"),
    // 프로그램 종료
    STATE_EXIT_PROGRAM(12, "프로그램 종료")
}
```

### 메뉴들을 컨트롤 하는 ControllerClass를 만들어준다.
```kotlin
package com.lion.controller

import com.lion.util.ProgramState.*
import com.lion.view.*

class ControllerClass {
  var programState = STATE_SHOW_MAIN_MENU
  lateinit var viewClass: ViewClass
  fun doController(){
    var isRunning = true
    while (isRunning){
      viewClass = when(programState){
        STATE_SHOW_MAIN_MENU -> ShowMainMenuView(this)
        STATE_INPUT_MEMBER_INFO -> InputMemberView()
        STATE_DELETE_MEMBER_INFO -> DeleteMemberView()
        STATE_SHOW_MEMBER_INFO_ALL -> ShowMemberAllView()
        STATE_SEARCH_MEMBER_INFO -> SearchMemberView()
        STATE_UPDATE_MEMBER_GRADE -> UpdateGradeMemberView()
        STATE_INPUT_PRODUCT_INFO -> InputProductView()
        STATE_DELETE_PRODUCT_INFO -> DeleteProductView()
        STATE_SHOW_PRODUCT_INFO_ALL -> ShowProductAllView()
        STATE_SEARCH_PRODUCT_INFO -> SearchProductView()
        STATE_CALCULATE_MEMBER_PRODUCT -> CalculateMemberView()
        STATE_EXIT_PROGRAM -> ExitProgramView()
      }
      viewClass.show()
    }
  }
}
```

### ShowMainMenu를 만들어준다.
```kotlin
class ShowMainMenuView:ViewClass() {
  override fun show() {

  }

  private fun showMainMenu(){

  }

  private fun inputMainMenu(){

  }

  private fun setMainState(){

  }
}
```

### ShowMainMenu 출력문을 만들어준다.
```kotlin
private fun showMainMenu(){
  println()
  println("메뉴를 선택해주세요.")
  println("1. 회원등록")
  println("2. 회원삭제")
  println("3. 회원전체보기")
  println("4. 회원검색")
  println("5. 회원별 등급 조정")
  println("6. 상품등록")
  println("7. 상품삭제")
  println("8. 상품전체보기")
  println("9. 상품검색")
  println("10. 회원별 상품할인률 계산")
  println("11. 프로그램종료")
  print("메뉴 선택 : ")
}
```

### ShowMainMenu 번호 입력문을 만들어준다.
```kotlin
private fun inputMainMenu():Int{
  val scanner = Scanner(System.`in`)
  return scanner.nextInt()
}
```

### Value파일에 메뉴 분기 클래스를 만들어준다.
```kotlin
enum class MenuState(var number: Int, var str:String){
  // 회원등록 상태
  MENU_INPUT_MEMBER_INFO(1, "회원등록 상태"),
  // 회원삭제 상태
  MENU_DELETE_MEMBER_INFO(2, "회원삭제 상태"),
  // 회원전체보기 상태
  MENU_SHOW_MEMBER_INFO_ALL(3, "회원전체보기 상태"),
  // 회원검색 상태
  MENU_SEARCH_MEMBER_INFO(4, "회원검색 상태"),
  // 회원별 등급 조정 상태
  MENU_UPDATE_MEMBER_GRADE(5, "회원별 등급 조정 상태"),
  // 상품등록 상태
  MENU_INPUT_PRODUCT_INFO(6, "상품등록 상태"),
  // 상품삭제 상태
  MENU_DELETE_PRODUCT_INFO(7, "상품삭제 상태"),
  // 상품전체보기 상태
  MENU_SHOW_PRODUCT_INFO_ALL(8, "상품전체보기 상태"),
  // 상품검색 상태
  MENU_SEARCH_PRODUCT_INFO(9, "상품검색 상태"),
  // 회원별 상품할인률 계산 상태
  MENU_CALCULATE_MEMBER_PRODUCT(10, "회원별 상품할인률 계산 상태"),
  // 프로그램 종료
  MENU_EXIT_PROGRAM(11, "프로그램 종료")
}
```

###### ShowMainMenu 메뉴변경 부분까지 만들어준다.
```kotlin
package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.util.MenuState
import com.lion.util.ProgramState
import java.util.Scanner

class ShowMainMenuView(val controllerClass: ControllerClass):ViewClass() {
  override fun show() {
    showMainMenu()
    val inputNumber = inputMainMenu()
    setMainState(inputNumber)
  }

  private fun showMainMenu(){
    println()
    println("메뉴를 선택해주세요.")
    println("1. 회원등록")
    println("2. 회원삭제")
    println("3. 회원전체보기")
    println("4. 회원검색")
    println("5. 회원별 등급 조정")
    println("6. 상품등록")
    println("7. 상품삭제")
    println("8. 상품전체보기")
    println("9. 상품검색")
    println("10. 회원별 상품할인률 계산")
    println("11. 프로그램종료")
    print("메뉴 선택 : ")
  }

  private fun inputMainMenu():Int{
    val scanner = Scanner(System.`in`)
    return scanner.nextInt()
  }

  private fun setMainState(inputNumber: Int){
    when(inputNumber){
      MenuState.MENU_INPUT_MEMBER_INFO.number ->
        controllerClass.programState = ProgramState.STATE_INPUT_MEMBER_INFO
      MenuState.MENU_DELETE_MEMBER_INFO.number ->
        controllerClass.programState = ProgramState.STATE_DELETE_MEMBER_INFO
      MenuState.MENU_SHOW_MEMBER_INFO_ALL.number ->
        controllerClass.programState = ProgramState.STATE_SHOW_MEMBER_INFO_ALL
      MenuState.MENU_SEARCH_MEMBER_INFO.number ->
        controllerClass.programState = ProgramState.STATE_SEARCH_MEMBER_INFO
      MenuState.MENU_UPDATE_MEMBER_GRADE.number ->
        controllerClass.programState = ProgramState.STATE_UPDATE_MEMBER_GRADE
      MenuState.MENU_INPUT_PRODUCT_INFO.number ->
        controllerClass.programState = ProgramState.STATE_INPUT_PRODUCT_INFO
      MenuState.MENU_DELETE_PRODUCT_INFO.number ->
        controllerClass.programState = ProgramState.STATE_DELETE_PRODUCT_INFO
      MenuState.MENU_SHOW_PRODUCT_INFO_ALL.number ->
        controllerClass.programState = ProgramState.STATE_SHOW_PRODUCT_INFO_ALL
      MenuState.MENU_SEARCH_PRODUCT_INFO.number ->
        controllerClass.programState = ProgramState.STATE_SEARCH_PRODUCT_INFO
      MenuState.MENU_CALCULATE_MEMBER_PRODUCT.number ->
        controllerClass.programState = ProgramState.STATE_CALCULATE_MEMBER_PRODUCT
      MenuState.MENU_EXIT_PROGRAM.number ->
        controllerClass.programState = ProgramState.STATE_EXIT_PROGRAM
    }
  }
}
```

### 분기가 되는지 확인하기위해 간단한 프로그램종료 부분으로 실험해본다.

### ExitProgramView를 만들어준다.
```kotlin
package com.lion.view

class ExitProgramView:ViewClass() {
  override fun show() {
    exitProgram()
  }

  private fun exitProgram(){
    println("프로그램이 종료됩니다.")
    System.exit(0)
  }
}
```

### Main을 만들어준다.
```kotlin
package com.lion.main

import com.lion.controller.ControllerClass

fun main() {
  val controllerClass = ControllerClass()
  controllerClass.doController()
}
```

### InputMemberView를 만들어준다.
```kotlin
package com.lion.view

class InputMemberView:ViewClass() {
    override fun show() {
        
    }
    
    private fun showInputMember(){
        
    }
    
    private fun inputMemberInfo(){
        
    }
    
    private fun saveMemberInfo(){
        
    }
}
```

### InputMemberView의 showInputMember()를 만들어준다.
```kotlin
private fun showInputMember(){
  println()
  println("회원정보를 입력해주세요")
}
```

### MemberModel을 만들어준다.
```kotlin
package com.lion.model

import com.lion.util.MemberGrade
import com.lion.util.Value
import java.io.Serializable
import java.util.Scanner

class MemberModel:Serializable {
  var memberName = ""
  var memberEmail = ""
  var memberGrade = ""
  fun inputMemberInfo(scanner: Scanner): MutableMap<String, Any> {
    var memberMap: MutableMap<String, Any>
    while (true) {
      println()
      println("*공지사항* : 등급은 브론즈, 실버, 골드, 플래티넘, 다이아까지 있습니다.")
      print("이름: ")
      memberName = scanner.next()
      print("이메일: ")
      memberEmail = scanner.next()
      print("등급: ")
      memberGrade = scanner.next()

      // 입력된 등급이 올바른지 확인
      if (memberGrade in listOf(
          MemberGrade.BRONZE.str,
          MemberGrade.SILVER.str,
          MemberGrade.GOLD.str,
          MemberGrade.PLATINUM.str,
          MemberGrade.DIAMOND.str)) {

        // 등급이 유효한 경우 멤버 정보를 맵에 저장
        memberMap = mutableMapOf(
          "memberName" to memberName,
          "memberEmail" to memberEmail,
          "memberGrade" to memberGrade
        )
        break
      } else {
        println("유효하지 않은 등급입니다. 다시 입력해주세요.")
      }
    }

    return memberMap
  }


  fun showMemberInfo(memberMap:MutableMap<String,Any>){
    println()
    println("이름 : ${memberMap["memberName"]}")
    println("이메일 : ${memberMap["memberEmail"]}")
    println("등급 : ${memberMap["memberGrade"]}등급")
  }
}
```

### InputMemberView의 inputMemberInfo()를 만들어준다.
```kotlin
private fun inputMemberInfo():MutableMap<String,Any>{
  val scanner = Scanner(System.`in`)
  val memberModel = MemberModel().inputMemberInfo(scanner)
  return memberModel
}
```

### MemberRepository를 만들어준다.
```kotlin
package com.lion.repository

class MemberRepository {
  companion object{
    fun saveMemberInfo(){

    }

    fun getMemberInfo(){

    }

    fun deleteMemberInfo(){

    }
  }
}
```

### MemberRepository의 saveMemberInfo()를 만들어준다.
```kotlin
fun saveMemberInfo(memberList: MutableList<MutableMap<String, Any>>){
  val fileOutputStream = FileOutputStream(Value().file_name1)
  val objectOutputStream = ObjectOutputStream(fileOutputStream)

  objectOutputStream.writeObject(memberList)

  objectOutputStream.flush()
  objectOutputStream.close()
  fileOutputStream.close()
}
```

### MemberRepository의 getMemberInfo()를 만들어준다.
```kotlin
fun getMemberInfo():MutableList<MutableMap<String, Any>>{
  var memberList = mutableListOf<MutableMap<String, Any>>()

  val file = File(Value().file_name1)

  if (file.exists()){
    val fileInputStream = FileInputStream(Value().file_name1)
    val objectInputStream = ObjectInputStream(fileInputStream)

    objectInputStream.readObject()

    objectInputStream.close()
    fileInputStream.close()
  }
  return memberList
}
```

### InputMemberView의 saveMemberInfo()를 만들어준다.
```kotlin
private fun saveMemberInfo(memberMap:MutableMap<String,Any>){
  val memberList = MemberRepository.getMemberInfo()
  memberList.forEach { mutableMap ->
    if(memberMap.getValue("memberEmail") == mutableMap["memberEmail"]) {
      println("이미 등록된 이메일입니다.")
      return
    }
  }
  memberList.add(memberMap)
  MemberRepository.saveMemberInfo(memberList)
  println("회원이 성공적으로 등록되었습니다.")
}
```

### MemberModel에 직렬화를 해준다.
```kotlin
class MemberModel:Serializable
```

### 정보를 확인하기 위해 ShowMemberAllView를 만들어준다.
```kotlin
package com.lion.view

class ShowMemberAllView:ViewClass() {
    override fun show() {
        
    }

    private fun showMemberInfoAll(){

    }

    private fun getMemberAllData(){
        
    }
    
    private fun showMemberAllData(){
        
    }
}
```

### 등록되어 있는 정보가 있는지 확인하기 위헤 checkMemberExist를 작성한다
```kotlin
package com.lion.util

import com.lion.repository.MemberRepository

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

        fun checkProductExist(){

        }
    }
}
```

### ShowMemberAllView의 showMemberInfoAll()를 만들어준다.
```kotlin
private fun showMemberInfoAll(){
  memberList.forEach { mutableMap ->
    MemberModel().showMemberInfo(mutableMap)
  }
}
```

### ShowMemberAllView의 getMemberAllData()를 만들어준다.
```kotlin
private fun getMemberAllData():Int{
  return memberList.size
}
```

### ShowMemberAllView의 getMemberAllData()를 만들어준다.
```kotlin
private fun showMemberAllData(memberCount:Int){
  println()
  println("총 회원 수 : ${memberCount}명")
}
```

### ShowMemberAllView를 완성한다.
```kotlin
package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.model.MemberModel
import com.lion.repository.MemberRepository
import com.lion.util.ProgramState
import com.lion.util.ToolClass

class ShowMemberAllView(val controllerClass: ControllerClass):ViewClass() {
  val memberList = MemberRepository.getMemberInfo()
  override fun show() {
    val chk1 = ToolClass.checkMemberExist()

    if (chk1 == false){
      println()
      println("등록된 회원이 없습니다.")
    } else {
      showMemberInfoAll()
      val memberCount = getMemberAllData()
      showMemberAllData(memberCount)
    }
    controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
  }

  private fun showMemberInfoAll(){
    memberList.forEach { mutableMap ->
      MemberModel().showMemberInfo(mutableMap)
    }
  }

  private fun getMemberAllData():Int{
    return memberList.size
  }

  private fun showMemberAllData(memberCount:Int){
    println()
    println("총 회원 수 : ${memberCount}명")
  }
}
```

### 회원 검색을 위해 SearchMemberView를 만들어준다.
```kotlin
class SearchMemberView:ViewClass() {
  override fun show() {
    
  }

  private fun inputSearchMemberName():String{
    
  }

  private fun checkSearchMemberExist(inputName:String):Boolean{
    
  }

  private fun getSearchMemberInfo(inputName:String):MutableList<MutableMap<String,Any>>{
    
  }
}
```

### SearchMemberView의 inputSearchMemberName()를 만들어준다.
```kotlin
private fun inputSearchMemberName():String{
  val scanner = Scanner(System.`in`)
  print("검색할 회원의 이름을 입력해주세요 : ")
  return scanner.next()
}
```

### SearchMemberView의 checkSearchMemberExist()를 만들어준다.
```kotlin
private fun checkSearchMemberExist(inputName:String):Boolean{
  var isExistMemberName = false
  val memberList = MemberRepository.getMemberInfo()

  memberList.forEach { mutableMap ->
    if (inputName == mutableMap["memberName"]) {
      isExistMemberName = true
      return@forEach
    }
  }
  return isExistMemberName
}
```

### SearchMemberView의 getSearchMemberInfo()를 만들어준다.
```kotlin
private fun getSearchMemberInfo(inputName:String):MutableList<MutableMap<String,Any>>{
  val searcMemberList = mutableListOf<MutableMap<String,Any>>()
  val memberList = MemberRepository.getMemberInfo()

  memberList.forEach { mutableMap ->
    if (inputName == mutableMap["memberName"]) {
      searcMemberList.add(mutableMap)
    }
  }
  return searcMemberList
}
```

### SearchMemberView를 완성해준다.
```kotlin
package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.model.MemberModel
import com.lion.repository.MemberRepository
import com.lion.util.ProgramState
import com.lion.util.ToolClass
import java.util.Scanner

class SearchMemberView(val controllerClass: ControllerClass):ViewClass() {
  override fun show() {
    val chk1 = ToolClass.checkMemberExist()

    if (chk1 == false){
      println()
      println("등록된 회원이 없습니다.")
    } else {
      val inputName = inputSearchMemberName()
      val chk2 = checkSearchMemberExist(inputName)

      if (chk2 == false){
        println()
        println("입력하신 회원이 존재하지 않습니다.")
      } else {
        val searchMemberList = getSearchMemberInfo(inputName)
        searchMemberList.forEach { mutableMap ->
          MemberModel().showMemberInfo(mutableMap)
        }
      }
    }
    controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
  }

  private fun inputSearchMemberName():String{
    val scanner = Scanner(System.`in`)
    print("검색할 회원의 이름을 입력해주세요 : ")
    return scanner.next()
  }

  private fun checkSearchMemberExist(inputName:String):Boolean{
    var isExistMemberName = false
    val memberList = MemberRepository.getMemberInfo()

    memberList.forEach { mutableMap ->
      if (inputName == mutableMap["memberName"]) {
        isExistMemberName = true
        return@forEach
      }
    }
    return isExistMemberName
  }

  private fun getSearchMemberInfo(inputName:String):MutableList<MutableMap<String,Any>>{
    val searcMemberList = mutableListOf<MutableMap<String,Any>>()
    val memberList = MemberRepository.getMemberInfo()

    memberList.forEach { mutableMap ->
      if (inputName == mutableMap["memberName"]) {
        searcMemberList.add(mutableMap)
      }
    }
    return searcMemberList
  }
}
```

### ControllerClass에 가서 회원입력상태 분기 부분을 수정한다.
```kotlin
STATE_SEARCH_MEMBER_INFO -> SearchMemberView(this)
```

### 회원 삭제를 위해 DeleteMemberView를 만들어준다.
```kotlin
package com.lion.view

import com.lion.controller.ControllerClass

class DeleteMemberView(val controllerClass: ControllerClass):ViewClass() {
  }

  private fun inputDeleteMemberName():String{
  }

  private fun inputDeleteMemberEmail():String{
  }

  private fun checkInputMemberExistName(inputName : String):Boolean{
  }

  private fun checkInputMemberExistEmail(inputEmail : String):Boolean{
  }

  private fun deleteMemberInfoByName(inputName : String){
  }

  private fun deleteMemberInfoByEmail(inputName : String, inputEmail : String){
  }
}
```

### DeleteMemberView의 inputDeleteMemberName()를 만들어준다.
```kotlin
private fun inputDeleteMemberName():String{
  val scanner = Scanner(System.`in`)
  println()
  print("삭제할 회원의 이름을 입력해주세요 : ")
  return scanner.next()
}
```

### DeleteMemberView의 inputDeleteMemberEmail()를 만들어준다.
```kotlin
private fun inputDeleteMemberEmail():String{
  val scanner = Scanner(System.`in`)
  println()
  print("삭제할 회원의 이메일을 입력해주세요 : ")
  return scanner.next()
}
```

### DeleteMemberView의 checkInputMemberExist()를 만들어준다.
```kotlin
private fun checkInputMemberExistName(inputName : String):Boolean{
  var chk1 = false

  memberList.forEach { mutableMap ->
    if (inputName == mutableMap["memberName"]) {
      chk1 = true
      return@forEach
    }
  }
  return chk1
}
```

### MemberRepository의 deleteMemberInfoByName()를 만들어준다.
```kotlin
fun deleteMemberInfo(inputName:String){
  val memberList = getMemberInfo()
  memberList.removeAll {
    if (inputName == it["memberName"]){
      true
    } else {
      false
    }
  }

  saveMemberInfo(memberList)
}
```

### MemberRepository의 deleteMemberInfoByEmail()를 만들어준다.
```kotlin
fun deleteMemberInfoByEmail(inputEmail:String){
  val memberList = getMemberInfo()
  memberList.removeAll {
    if (inputEmail == it["memberEmail"]){
      true
    } else {
      false
    }
  }
  saveMemberInfo(memberList)
}
```

### DeleteMemberView의 deleteMemberInfoByName()를 만들어준다.
```kotlin
private fun deleteMemberInfo(inputName : String){
  MemberRepository.deleteMemberInfo(inputName)
  println()
  println("${inputName}님의 정보를 삭제하였습니다.")
}
```

### DeleteMemberView의 deleteMemberInfoByEmail()를 만들어준다.
```kotlin
private fun deleteMemberInfoByEmail(inputName : String, inputEmail : String){
  MemberRepository.deleteMemberInfoByEmail(inputEmail)
  println()
  println("${inputName}님의 정보를 삭제하였습니다.")
}
```

### DeleteMemberView를 완성해준다.
```kotlin
class DeleteMemberView(val controllerClass: ControllerClass):ViewClass() {
  val memberList = MemberRepository.getMemberInfo()
  override fun show() {
    val chk1 = ToolClass.checkMemberExist()

    if (chk1 == false){
      println()
      println("등록된 회원이 없습니다.")
    } else {
      val inputName = inputDeleteMemberName()
      val chk2 = checkInputMemberExistName(inputName)

      val nameCount = memberList.count { it["memberName"] == inputName}
      if (nameCount > 1){
        if (chk2 == false){
          println()
          println("입력하신 회원이 없습니다.")
        } else {
          val inputEmail = inputDeleteMemberEmail()
          val chk3 = checkInputMemberExistEmail(inputEmail)

          if (chk3 == false) {
            println()
            println("입력하신 이메일이 유효하지 않습니다.")
          } else {
            deleteMemberInfoByEmail(inputName, inputEmail)
          }
        }
      } else {
        if (chk2 == false) {
          println()
          println("입력하신 회원이 없습니다.")
        } else {
          deleteMemberInfoByName(inputName)
        }
      }
    }
    controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
  }

  private fun inputDeleteMemberName():String{
    val scanner = Scanner(System.`in`)
    println()
    print("삭제할 회원의 이름을 입력해주세요 : ")
    return scanner.next()
  }

  private fun inputDeleteMemberEmail():String{
    val scanner = Scanner(System.`in`)
    println()
    print("삭제할 회원의 이메일을 입력해주세요 : ")
    return scanner.next()
  }

  private fun checkInputMemberExistName(inputName : String):Boolean{
    var chk1 = false

    memberList.forEach { mutableMap ->
      if (inputName == mutableMap["memberName"]) {
        chk1 = true
        return@forEach
      }
    }
    return chk1
  }

  private fun checkInputMemberExistEmail(inputEmail : String):Boolean{
    var chk1 = false

    memberList.forEach { mutableMap ->
      if (inputEmail == mutableMap["memberEmail"]) {
        chk1 = true
        return@forEach
      }
    }
    return chk1
  }

  private fun deleteMemberInfoByName(inputName : String){
    MemberRepository.deleteMemberInfoByName(inputName)
    println()
    println("${inputName}님의 정보를 삭제하였습니다.")
  }

  private fun deleteMemberInfoByEmail(inputName : String, inputEmail : String){
    MemberRepository.deleteMemberInfoByEmail(inputEmail)
    println()
    println("${inputName}님의 정보를 삭제하였습니다.")
  }
}
```

### ControllerClass에 가서 회원삭제상태 분기 부분을 수정한다.
```kotlin
STATE_SEARCH_MEMBER_INFO -> SearchMemberView(this)
```

### InputProductView를 만들어준다.
```kotlin
package com.lion.view

class InputProductView:ViewClass() {
  override fun show() {

  }

  private fun showInputProduct(){

  }

  private fun inputProductInfo(){

  }

  private fun showProductInfo(){

  }
}
```

### InputProductView의 showInputProduct()를 만들어준다.
```kotlin
private fun showInputProduct(){
  println()
  println("상품정보를 입력해주세요")
}
```

### ProductModel를 만들어준다.
```kotlin
package com.lion.model

class ProductModel {
  var productName = ""
  var productPrice = ""

  fun inputProductInfo(){

  }

  fun showProductInfo(){

  }
}
```

### ProductModel의 inputProductInfo()를 만들어준다.
```kotlin
fun inputProductInfo(scanner: Scanner):MutableMap<String, Any>{
  println()
  print("상품 이름 : ")
  productName = scanner.next()
  print("상품 가격 : ")
  productPrice = scanner.nextInt()

  val productMap:MutableMap<String, Any> = mutableMapOf(
    "productName" to productName,
    "productPrice" to productPrice)

  return productMap
}
```

### ProductModel의 showProductInfo()를 만들어준다.
```kotlin
fun showProductInfo(productMap : MutableMap<String, Any>){
  println()
  println("상품 이름 : ${productMap["productName"]}")
  println("상품 가격 : ${productMap["productPrice"]}원")
}
```

### InputProductView의 inputProductInfo()를 만들어준다.
```kotlin
private fun inputProductInfo():MutableMap<String,Any>{
  val scanner = Scanner(System.`in`)
  val productModel = ProductModel().inputProductInfo(scanner)
  return productModel
}
```

### ProductRepository를 만들어준다.
```kotlin
package com.lion.repository

class ProductRepository {
  companion object {
    fun getProductInfo(){

    }

    fun saveProductInfo(){

    }

    fun deleteProductInfo(){


    }
  }
}
```

### ProductRepository의 getProductInfo()를 만들어준다.
```kotlin
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
```

### ProductRepository의 saveProductInfo()를 만들어준다.
```kotlin
fun saveProductInfo(productList: MutableList<MutableMap<String,Any>>){
  val fileOutputStream = FileOutputStream(Value().file_name2)
  val objectOutputStream = ObjectOutputStream(fileOutputStream)

  objectOutputStream.writeObject(productList)

  objectOutputStream.flush()
  objectOutputStream.close()
  fileOutputStream.close()
}
```

### InputProductView의 saveProductInfo()를 만들어준다.
```kotlin
private fun inputProductInfo():MutableMap<String,Any>{
  val scanner = Scanner(System.`in`)
  val productModel = ProductModel().inputProductInfo(scanner)
  return productModel
}
```

### InputProductView를 완성해준다.
```kotlin
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
```

### ControllerClass에 가서 상품추가상태 분기 부분을 수정한다.
```kotlin
STATE_INPUT_PRODUCT_INFO -> InputProductView(this)
```

### ShowProductAllView를 만들어준다.
```kotlin
package com.lion.view

class ShowProductAllView:ViewClass() {
  override fun show() {

  }

  private fun showProductInfoAll(){

  }

  private fun getProductAllData(){

  }

  private fun showProductAllData(){

  }
}
```

### ShowProductAllView의 showProductInfoAll()를 만들어준다.
```kotlin
private fun showProductInfoAll(){
  productList.forEach { mutableMap ->
    ProductModel().showProductInfo(mutableMap)
  }
}
```

### ShowProductAllView의 getProductAllData()를 만들어준다.
```kotlin
private fun getProductAllData():Int{
  return productList.size
}
```

### ShowProductAllView의 showProductAllData()를 만들어준다.
```kotlin
private fun showProductAllData(productCount:Int){
  println()
  println("전체 상품의 수 : ${productCount}")
}
```

### ToolClass의 checkProductExist()를 만들어준다.
```kotlin
fun checkProductExist():Boolean{
  val productList = ProductRepository.getProductInfo()

  if (productList.size == 0) {
    return false
  } else {
    return true
  }
}
```

### ShowProductAllView를 완성해준다.
```kotlin
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
    println("전체 상품의 수 : ${productCount}")
  }
}
```

### ControllerClass에 가서 상품전체보기상태 분기 부분을 수정한다.
```kotlin
STATE_SHOW_PRODUCT_INFO_ALL -> ShowProductAllView(this)
```

### DeleteProductView를 만들어준다.
```kotlin
package com.lion.view

class DeleteProductView:ViewClass() {
  override fun show() {

  }

  private fun inputDeleteProductName(){

  }

  private fun inputDeleteProductCompany(){
      
  }

  private fun checkInputProductNameExist(){

  }

  private fun checkInputProductCompanyExist(){
    
  }

  private fun deleteProductInfoByName(){

  }

  private fun deleteProductInfoByCompany(){
    
  }
}
```

### DeleteProductView의 inputDeleteProductName()를 만들어준다.
```kotlin
private fun inputDeleteProductName():String{
  val scanner = Scanner(System.`in`)
  println()
  print("삭제할 상품의 이름을 입력해주세요 : ")
  return scanner.next()
}
```

### DeleteProductView의 inputDeleteProductCompany()를 만들어준다.
```kotlin
private fun inputDeleteProductCompany():String{
  val scanner = Scanner(System.`in`)
  println()
  print("삭제할 상품의 회사를 입력해주세요 : ")
  return scanner.next()
}
```

### DeleteProductView의 checkInputProductNameExist()를 만들어준다.
```kotlin
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
```

### DeleteProductView의 checkInputProductCompanyExist()를 만들어준다.
```kotlin
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
```

### ProductRepository의 deleteProductInfo()를 만들어준다.
```kotlin
fun deleteProductInfo(inputName:String){
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
```

### ProductRepository의 deleteProductInfoByName()를 만들어준다.
```kotlin
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
```

### ProductRepository의 deleteProductInfoByCompany()를 만들어준다.
```kotlin
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
```

### DeleteProductView의 deleteProductInfoByName()를 만들어준다.
```kotlin
private fun deleteProductInfoByName(inputName:String){
  ProductRepository.deleteProductInfoByName(inputName)
  println()
  println("${inputName}의 정보를 삭제하였습니다.")
}
```

### DeleteProductView의 deleteProductInfoByCompany()를 만들어준다.
```kotlin
private fun deleteProductInfoByCompany(inputName:String, inputCompany: String){
  ProductRepository.deleteProductInfoByCompany(inputCompany)
  println()
  println("${inputName}의 정보를 삭제하였습니다.")
}
```

### DeleteProductView를 완성해준다.
```kotlin
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
```

### ControllerClass에 가서 상품삭제상태 분기 부분을 수정한다.
```kotlin
STATE_DELETE_PRODUCT_INFO -> DeleteProductView(this)
```

### SearchProductView를 만들어준다.
```kotlin
class SearchProductView(val controllerClass: ControllerClass):ViewClass() {
  
  override fun show() {
    
  }

  private fun inputSearchProductName(){
    
  }

  private fun checkInputProductNameExist(){
    
  }

  private fun getSearchProductInfo(){
    
  }
}
```

### SearchProductView의 inputSearchProductName()를 만들어준다.
```kotlin
private fun inputSearchProductName():String{
  val scanner = Scanner(System.`in`)
  println()
  print("검색하실 상품의 이름을 입력해주세요 : ")
  return scanner.next()
}
```

### SearchProductView의 checkInputProductNameExist()를 만들어준다.
```kotlin
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
```

### SearchProductView의 getSearchProductInfo()를 만들어준다.
```kotlin
private fun getSearchProductInfo(inputName:String):MutableList<MutableMap<String,Any>>{
  val searchProductList = mutableListOf<MutableMap<String,Any>>()

  productList.forEach { mutableMap ->
    if (inputName == mutableMap["productName"]){
      searchProductList.add(mutableMap)
    }
  }
  return searchProductList
}
```

### SearchProductView를 완성해준다.
```kotlin
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
```

### ControllerClass에 가서 상품검색상태 분기 부분을 수정한다.
```kotlin
STATE_SEARCH_PRODUCT_INFO -> SearchProductView(this)
```

### UpdateGradeMemberView를 만들어준다.
```kotlin
package com.lion.view

class UpdateGradeMemberView:ViewClass() {
  override fun show() {

  }

  private fun inputMemberName(){

  }

  private fun inputMemberEmail(){
      
  }

  private fun checkSearchMemberExist(){
    
  }

  private fun checkInputMemberExistEmail(){
    
  }

  private fun getMemberInfoByName(){

  }

  private fun getMemberInfoByEmail(){
    
  }

  private fun inputUpdateGrade(){

  }

  private fun updateGradeByName(){
    
  }

  private fun updateGradeByEmail(){
    
  }
}
```

### UpdateGradeMemberView의 inputMemberName()를 만들어준다.
```kotlin
private fun inputMemberName():String{
  val scanner = Scanner(System.`in`)
  println()
  print("등급을 수정할 회원의 이름을 입력해주세요 : ")
  return scanner.next()
}
```

### UpdateGradeMemberView의 inputMemberEmail()를 만들어준다.
```kotlin
private fun inputMemberEmail():String{
  val scanner = Scanner(System.`in`)
  println()
  print("등급을 수정할 회원의 이메일을 입력해주세요 : ")
  return scanner.next()
}
```

### UpdateGradeMemberView의 checkSearchMemberExist()를 만들어준다.
```kotlin
private fun checkSearchMemberExist(inputName:String):Boolean{
  var isExistMemberName = false
  val memberList = MemberRepository.getMemberInfo()

  memberList.forEach { mutableMap ->
    if (inputName == mutableMap["memberName"]) {
      isExistMemberName = true
      return@forEach
    }
  }
  return isExistMemberName
}
```

### UpdateGradeMemberView의 checkInputMemberExistEmail()를 만들어준다.
```kotlin
private fun checkInputMemberExistEmail(inputEmail : String):Boolean{
  var chk1 = false

  memberList.forEach { mutableMap ->
    if (inputEmail == mutableMap["memberEmail"]) {
      chk1 = true
      return@forEach
    }
  }
  return chk1
}
```

### UpdateGradeMemberView의 getMemberInfoByName()를 만들어준다.
```kotlin
private fun getMemberInfoByName(inputName:String):MutableList<MutableMap<String,Any>>{
  val searcMemberListByName = mutableListOf<MutableMap<String,Any>>()
  val memberList = MemberRepository.getMemberInfo()

  memberList.forEach { mutableMap ->
    if (inputName == mutableMap["memberName"]) {
      searcMemberListByName.add(mutableMap)
    }
  }
  return searcMemberListByName
}
```

### UpdateGradeMemberView의 getMemberInfoByEmail()를 만들어준다.
```kotlin
private fun getMemberInfoByEmail(inputEmail:String):MutableList<MutableMap<String,Any>>{
  val searcMemberListByEmail = mutableListOf<MutableMap<String,Any>>()
  val memberList = MemberRepository.getMemberInfo()

  memberList.forEach { mutableMap ->
    if (inputEmail == mutableMap["memberEmail"]) {
      searcMemberListByEmail.add(mutableMap)
    }
  }
  return searcMemberListByEmail
}
```

### UpdateGradeMemberView의 inputUpdateGrade()를 만들어준다.
```kotlin
private fun inputUpdateGrade():String{
  val scanner = Scanner(System.`in`)
  println()
  print("수정할 등급을 입력해주세요 : ")
  return scanner.next()
}
```

### MemberRepository의 updateGradeByName()를 만들어준다.
```kotlin
fun updateGradeByName(inputName: String, inputGrade:String){
  val memberList = getMemberInfo()
  memberList.forEach { member ->
    if (inputName == member["memberName"]){
      member["memberGrade"] = inputGrade
    }
  }
  saveMemberInfo(memberList)
}
```

### MemberRepository의 updateGradeByEmail()를 만들어준다.
```kotlin
fun updateGradeByEmail(inputEmail: String, inputGrade:String){
  val memberList = getMemberInfo()
  memberList.forEach { member ->
    if (inputEmail == member["memberEmail"]){
      member["memberGrade"] = inputGrade
    }
  }
  saveMemberInfo(memberList)
}
```

### UpdateGradeMemberView의 updateGradeByName()를 만들어준다.
```kotlin
private fun updateGradeByName(inputName: String, inputGrade:String){
  MemberRepository.updateGradeByName(inputName, inputGrade)
  println()
  println("${inputName}의 등급을 ${inputGrade}등급으로 수정하였습니다.")
}
```

### UpdateGradeMemberView의 updateGradeByEmail()를 만들어준다.
```kotlin
private fun updateGradeByEmail(inputName: String, inputEmail: String, inputGrade:String){
  MemberRepository.updateGradeByEmail(inputEmail, inputGrade)
  println()
  println("${inputName}의 등급을 ${inputGrade}등급으로 수정하였습니다.")
}
```

### UpdateGradeMemberView를 완성해준다.
```kotlin
package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.model.MemberModel
import com.lion.repository.MemberRepository
import com.lion.util.ProgramState
import com.lion.util.ToolClass
import java.util.Scanner

class UpdateGradeMemberView(val controllerClass: ControllerClass):ViewClass() {
  val memberList = MemberRepository.getMemberInfo()
  override fun show() {
    val chk1 = ToolClass.checkMemberExist()

    if (chk1 == false){
      println()
      println("등록되어 있는 회원정보가 없습니다.")
    } else {
      val inputName = inputMemberName()
      val chk2 = checkSearchMemberExist(inputName)

      val nameCount = memberList.count { it["memberName"] == inputName}
      if (nameCount > 1) {
        if (chk2 == false) {
          println()
          println("입력하신 회원의 정보가 존재하지 않습니다.")
        } else {
          val searcMemberListByName = getMemberInfoByName(inputName)
          searcMemberListByName.forEach { mutableMap ->
            MemberModel().showMemberInfo(mutableMap)
          }

          val inputEmail = inputMemberEmail()
          val chk3 = checkInputMemberExistEmail(inputEmail)

          if (chk3 == false) {
            println()
            println("입력하신 회원의 이메일이 유효하지 않습니다.")
          } else {
            val searcMemberListByEmail = getMemberInfoByEmail(inputEmail)
            searcMemberListByEmail.forEach { mutableMap ->
              MemberModel().showMemberInfo(mutableMap)
            }
            val updateGrade = inputUpdateGrade()
            updateGradeByEmail(inputName, inputEmail, updateGrade)
          }
        }
      } else {
        if (chk2 == false) {
          println()
          println("입력하신 회원의 정보가 존재하지 않습니다.")
        } else {
          val searcMemberListByName = getMemberInfoByName(inputMemberName())
          searcMemberListByName.forEach { mutableMap ->
            MemberModel().showMemberInfo(mutableMap)
          }
          val updateGrade = inputUpdateGrade()
          updateGradeByName(inputName, updateGrade)
        }
      }
      controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }
  }

  private fun inputMemberName():String{
    val scanner = Scanner(System.`in`)
    println()
    print("등급을 수정할 회원의 이름을 입력해주세요 : ")
    return scanner.next()
  }

  private fun inputMemberEmail():String{
    val scanner = Scanner(System.`in`)
    println()
    print("등급을 수정할 회원의 이메일을 입력해주세요 : ")
    return scanner.next()
  }

  private fun checkSearchMemberExist(inputName:String):Boolean{
    var isExistMemberName = false
    val memberList = MemberRepository.getMemberInfo()

    memberList.forEach { mutableMap ->
      if (inputName == mutableMap["memberName"]) {
        isExistMemberName = true
        return@forEach
      }
    }
    return isExistMemberName
  }

  private fun checkInputMemberExistEmail(inputEmail : String):Boolean{
    var chk1 = false

    memberList.forEach { mutableMap ->
      if (inputEmail == mutableMap["memberEmail"]) {
        chk1 = true
        return@forEach
      }
    }
    return chk1
  }

  private fun getMemberInfoByName(inputName:String):MutableList<MutableMap<String,Any>>{
    val searcMemberListByName = mutableListOf<MutableMap<String,Any>>()
    val memberList = MemberRepository.getMemberInfo()

    memberList.forEach { mutableMap ->
      if (inputName == mutableMap["memberName"]) {
        searcMemberListByName.add(mutableMap)
      }
    }
    return searcMemberListByName
  }

  private fun getMemberInfoByEmail(inputEmail:String):MutableList<MutableMap<String,Any>>{
    val searcMemberListByEmail = mutableListOf<MutableMap<String,Any>>()
    val memberList = MemberRepository.getMemberInfo()

    memberList.forEach { mutableMap ->
      if (inputEmail == mutableMap["memberEmail"]) {
        searcMemberListByEmail.add(mutableMap)
      }
    }
    return searcMemberListByEmail
  }

  private fun inputUpdateGrade():String{
    val scanner = Scanner(System.`in`)
    println()
    print("수정할 등급을 입력해주세요 : ")
    return scanner.next()
  }

  private fun updateGradeByName(inputName: String, inputGrade:String){
    MemberRepository.updateGradeByName(inputName, inputGrade)
    println()
    println("${inputName}의 등급을 ${inputGrade}등급으로 수정하였습니다.")
  }

  private fun updateGradeByEmail(inputName: String, inputEmail: String, inputGrade:String){
    MemberRepository.updateGradeByEmail(inputEmail, inputGrade)
    println()
    println("${inputName}의 등급을 ${inputGrade}등급으로 수정하였습니다.")
  }
}
```

### ControllerClass에 가서 등급수정상태 분기 부분을 수정한다.
```kotlin
STATE_UPDATE_MEMBER_GRADE -> UpdateGradeMemberView(this)
```

### CalculateMemberView를 만들어준다.
```kotlin
package com.lion.view

class CalculateMemberView:ViewClass() {
  override fun show() {
  }

  private fun inputMenuType(){

  }

  private fun showMemberInfo(){

  }

  private fun showProductInfo(){

  }
  
  private fun inputMember(){

  }

  private fun inputProduct(){

  }

  private fun calculateDiscount(){

  }
}
```

### CalculateMemberView의 inputMenuType()를 만들어준다.
```kotlin
private fun inputMenuType():Int{
  val scanner = Scanner(System.`in`)
  println()
  println("메뉴를 선택해주세요")
  println("1. 회원 선택")
  println("2. 상품 선택")
  print("메뉴 선택 : ")
  return scanner.nextInt()
}
```

### Value의 CalculateMenu()를 만들어준다.
```kotlin
enum class CalculateMenu(var number: Int, var str:String){
  // 회원선택
  SELECTED_MEMBER(1, "회원선택"),
  // 상품선택
  SELECTED_PRODUCT(2, "상품선택"),
}
```

### CalculateMemberView의 showMemberInfo()를 만들어준다.
```kotlin
private fun showMemberInfo(){
  memberList.forEachIndexed { index, mutableMap ->
    println()
    println("${index + 1}번째 회원")
    MemberModel().showMemberInfo(mutableMap)
  }
}
```

### CalculateMemberView의 showProductInfo()를 만들어준다.
```kotlin
private fun showProductInfo(){
  productList.forEachIndexed { index, mutableMap ->
    println()
    println("${index + 1}번째 상품")
    ProductModel().showProductInfo(mutableMap)
  }
}
```

### CalculateMemberView의 inputMember()를 만들어준다.
```kotlin
private fun inputMember():Int{
  val scanner = Scanner(System.`in`)
  println()
  print("회원의 번호를 선택해주세요 : ")
  return scanner.nextInt()
}
```

### CalculateMemberView의 inputProduct()를 만들어준다.
```kotlin
private fun inputProduct():Int{
  val scanner = Scanner(System.`in`)
  println()
  print("상품의 번호를 선택해주세요 : ")
  return scanner.nextInt()
}
```

### CalculateMemberView의 getNumberMemberInfo()를 만들어준다.
```kotlin
private fun getNumberMemberInfo(inputNumber:Int):MutableList<MutableMap<String,Any>>{
  val selectedMemberList = mutableListOf<MutableMap<String,Any>>()

  memberList.forEachIndexed { index, mutableMap ->
    if (inputNumber == index + 1) {
      selectedMemberList.add(mutableMap)
    }
  }
  return selectedMemberList
}
```

### CalculateMemberView의 getNumberProductInfo()를 만들어준다.
```kotlin
private fun getNumberProductInfo(inputNumber:Int):MutableList<MutableMap<String,Any>>{
  val selectedProductList = mutableListOf<MutableMap<String,Any>>()

  productList.forEachIndexed { index, mutableMap ->
    if (inputNumber == index + 1) {
      selectedProductList.add(mutableMap)
    }
  }

  return selectedProductList
}
```

### Value의 MemberGrade()를 만들어준다.
```kotlin
enum class MemberGrade(var number: Int, var str:String){
  // 브론즈
  BRONZE(1, "브론즈"),
  // 실버
  SILVER(2, "실버"),
  // 골드
  GOLD(3, "골드"),
  // 플래티넘
  PLATINUM(4, "플래티넘"),
  // 다이아
  DIAMOND(5, "다이아"),
}
```

### CalculateMemberView의 calculateDiscount()를 만들어준다.
```kotlin
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
  println("${getmemberName}회원이 ${getproductName}을 살때 가격은 ${resultPrice}원 입니다")
  println("${getmemberGrade}등급 혜택 ${discountPercent * 100}% 할인이 적용되었습니다.")
}
```

### CalculateMemberView를 완성해준다.
```kotlin
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
                        println()
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
                        println()
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
        println("${getmemberName}회원이 ${getproductName}을 살때 가격은 ${resultPrice}원 입니다")
        println("${getmemberGrade}등급 혜택 ${discountPercent * 100}% 할인이 적용되었습니다.")
    }
}
```

### ControllerClass에 가서 상품 할인율 계산 분기 부분을 수정한다.
```kotlin
STATE_CALCULATE_MEMBER_PRODUCT -> CalculateMemberView(this)
```