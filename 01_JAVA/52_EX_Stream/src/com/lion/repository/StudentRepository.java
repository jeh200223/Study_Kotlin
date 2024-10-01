package com.lion.repository;

import com.lion.model.StudentClass;
import com.lion.util.Values;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class StudentRepository {
    // 학생 정보를 저장하는 메서드
    public static void saveStudentInfo(StudentClass studentClass){
        try{
            // 저장되어 있는 학생 정보 전체를 읽어온다.
            ArrayList<StudentClass> studentList = getStudentInfoAll();
            // 만약 가져온 것이 없면(파일이 없을 경우)
            // 새로운 리스트를 생성한다.
            if(studentList == null){
                studentList = new ArrayList<>();
            }
            // 리스트에 학생 객체를 담아준다.
            studentList.add(studentClass);
            // 파일에 저장한다.
            FileOutputStream fos = new FileOutputStream(Values.FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
            oos.flush();
            oos.close();
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    // 저장된 학생 정보가 있는지 확인하는 메서드
    public static boolean checkStudentExistAll(){
        boolean result = true;

        try{
            // 저장된 학생 정보들을 가져온다.
            ArrayList<StudentClass> studentList = getStudentInfoAll();
            // 만약 null이거나 관리하는 객체의 개수가 0으면 저장된 것이 없는 것으로 한다.
            if(studentList == null || studentList.size() == 0){
                result = false;
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return result;
    }

    // 이름을 통해 학생 정보를 검색하는 메서드
    public static StudentClass searchStudentInfoByName(String searchStudentName){
        StudentClass studentClass = null;

        // 학생들의 정보를 가져온다.
        ArrayList<StudentClass> studentList = getStudentInfoAll();
        // 저장되어 있는 학생이 있다면
        if(studentList != null && studentList.size() > 0){
            // 학생의 수 만큼 반복한다.
            for(StudentClass item : studentList){
                // 현재의 학생 이름과 검색하고자 하는 학생의 이름이 같다면..
                if(item.getStudentName().equals(searchStudentName)){
                    // 현재 학생 객체를 변수에 담아준다.
                    studentClass = item;
                    break;
                }
            }
        }

        return studentClass;
    }

    // 총 학생수를 구하는 메서드
    public static int getStudentCountAll(){
        // 학생 수를 담을 변수
        int studentCount = 0;

        // 학생 정보를 가져온다.
        ArrayList<StudentClass> studentList = getStudentInfoAll();
        // 저장된 학생 정보가 있다면..
        if(studentList != null || studentList.size() > 0){
            studentCount = studentList.size();
        }

        return studentCount;
    }

    // 학생 정보 전체를 가져오는 메서드
    public static ArrayList<StudentClass> getStudentInfoAll(){
        ArrayList<StudentClass> studentList = null;

        try{
            // 파일이 있는지 확인한다.
            File file = new File(Values.FILE_NAME);
            if(file.exists()){
                // 파일로 부터 리스트를 읽어온다.
                FileInputStream fis = new FileInputStream(Values.FILE_NAME);
                ObjectInputStream ois = new ObjectInputStream(fis);
                studentList = (ArrayList<StudentClass>) ois.readObject();
                ois.close();
                fis.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        return studentList;
    }

    // 각 운동부 별 학생 수를 구하는 메서드
    public static HashMap<String, Integer> getStudentCountByType(){
        // 각 운동부 학생의 수를 담을 변수
        int soccerCount = 0;
        int baseBallCount = 0;
        int basketBallCount = 0;

        // 학생들의 데이터를 가져온다.
        ArrayList<StudentClass> studentList = getStudentInfoAll();

        // 가져온 데이터가 있다면
        if(studentList != null && studentList.size() > 0){
            // 학생의 수 만큼 반복한다.
            for(StudentClass item : studentList){
                // 운동부 타입으로 분기한다.
                switch (item.getType()){
                    case Values.TYPE_SOCCER :
                        soccerCount++;
                        break;
                    case Values.TYPE_BASEBALL:
                        baseBallCount++;
                        break;
                    case Values.TYPE_BASKETBALL:
                        basketBallCount++;
                        break;
                }
            }
        }
        // 학생 수를 맵에 담겠는다.
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("soccerCount", soccerCount);
        map1.put("baseBallCount", baseBallCount);
        map1.put("basketBallCount", basketBallCount);

        return map1;
    }

    // 이름을 통해 학생이 있는지 검사
    public static boolean checkStudentExistByName(String searchStudentName){
        boolean result = false;

        // 학생들의 정보를 가져온다.
        ArrayList<StudentClass> studentList = getStudentInfoAll();
        // 가져온 학생 정보가 있다면..
        if(studentList != null && studentList.size() > 0){
            // 학생의 수 만큼 반복한다.
            for(StudentClass item : studentList){
                // 학생의 이름과 검색 이름이 같은지 확인한다.
                if(item.getStudentName().equals(searchStudentName)){
                    result = true;
                    break;
                }
            }
        }

        return result;
    }

    // 입력한 학생 정보를 삭제하는 메서드
    public static void deleteStudentInfoByName(String deleteStudentName){
        // 삭제할 학생 객체의 위치를 가지고 있는 변수
        int deleteIndex = -1;
        // 학생 정보들을 가져온다.
        ArrayList<StudentClass> studentList = getStudentInfoAll();
        // 가져온 것이 있다면
        if(studentList != null && studentList.size() > 0){
            // 학생의 수 만큼 반복한다.
            for(int i = 0 ; i < studentList.size() ; i++){
                // 이름이 같다면
                // i 번째 객체를 추출한다.
                StudentClass item = studentList.get(i);
                if(item.getStudentName().equals(deleteStudentName)){
                    // 현재의 순값을 변수에 담아준다.
                    deleteIndex = i;
                    break;
                }
            }
        }
        // 삭제한다.
        if(deleteIndex > -1){
            studentList.remove(deleteIndex);
            try{
                // 파일에 저장한다.
                FileOutputStream fos = new FileOutputStream(Values.FILE_NAME);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(studentList);
                oos.flush();
                oos.close();
                fos.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}