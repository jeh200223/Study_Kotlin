import java.io.*;
import java.util.Scanner;

public class AnimalClass {
    String [] name = new String[3];
    int [] age = new int[3];
    int [] weights = new int[3];

    public void inputAnimalInfo() {

        try {
            FileOutputStream fos = new FileOutputStream("test.dat");
            DataOutputStream dos = new DataOutputStream(fos);

            for (int i = 0; i < 3; i++) {
                System.out.println();
                Scanner scanner = new Scanner(System.in);
                System.out.print("이름 입력 : ");
                name[i] = scanner.next();
                System.out.print("나이 입력 : ");
                age[i] = scanner.nextInt();
                System.out.print("몸무게 입력 : ");
                weights[i] = scanner.nextInt();

                dos.writeUTF(name[i]);
                dos.writeInt(age[i]);
                dos.writeInt(weights[i]);
            }
            dos.flush();
            dos.close();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void showAnimalInfo() {

        try {
            FileInputStream fis = new FileInputStream("test.dat");
            DataInputStream dis = new DataInputStream(fis);

            for (int i = 0; i < 3; i++){
                name[i] = dis.readUTF();
                age[i] = dis.readInt();
                weights[i] = dis.readInt();

                System.out.printf("이름 : %s\n", name[i]);
                System.out.printf("나이 : %s\n", age[i]);
                System.out.printf("몸무게 : %s\n", weights[i]);
            }
            dis.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

