package com.lion.repository;

import com.lion.model.AnimalClass;
import com.lion.util.Values;

import java.io.*;
import java.util.ArrayList;

public class AnimalRepository {

    public void saveAnimalInfo(AnimalClass animalClass) {
        try {
            ArrayList<AnimalClass> animalList = getAnimalInfoAll();
            if (animalList == null) {
                animalList = new ArrayList<>();
            }
            animalList.add(animalClass);

            FileOutputStream fos = new FileOutputStream(Values.FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(animalList);

            oos.flush();
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean checkAnimalExistInfo() {
        boolean result = true;
        try {
            ArrayList<AnimalClass> animalList = getAnimalInfoAll();
            if(animalList == null || animalList.size() == 0) {
                result = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public AnimalClass searchAnimalByName(String searchAnimalName) {
        AnimalClass animalClass = null;

        ArrayList<AnimalClass> animalList = getAnimalInfoAll();

        if(animalList != null || animalList.size() > 0) {
            for(AnimalClass item : animalList) {
                if(item.getAnimalName().equals(searchAnimalName)){
                    animalClass = item;
                    break;
                }
            }
        }

        return animalClass;
    }

    public void getAnimalCount() {

    }

    public ArrayList<AnimalClass> getAnimalInfoAll () {
        ArrayList<AnimalClass> animalList = null;

        try {
            File file = new File(Values.FILE_NAME);
            if(file.exists()) {
                FileInputStream fis = new FileInputStream(Values.FILE_NAME);
                ObjectInputStream ois = new ObjectInputStream(fis);

                animalList = (ArrayList<AnimalClass>) ois.readObject();
                ois.close();
                fis.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return animalList;
    }

    public void getAnimalCountByType() {

    }

    public void checkAnimalExistByName () {

    }

    public void deleteAnimalInfoByName() {

    }
}
