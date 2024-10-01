// 스트림 : 데이터를 외부와 주고 받기 위한 통로

//기본 스트림 : 실제로 데이터 입출력을 담당한다.
//어떠한 것과 데이터를 주고 받을지에 따라 스트림을 생성하는
//방법이 다르다.
//
//필터 스트림 : 다른 스트림으로 부터 데이터를 받거나 다른 스트림으로 데이터를 전달하는 스트림
//기본 스트림이 반드시 존재해야한다.
//데이터를 가공 처리하는 역할을 한다.

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass {
    public static void main(String[] args) {
        // 파일에 데이터를 쓴다.
        // 지정한 파일이 없으면 파일이 만들어진다.
        try{
            // 파일과 연결되는 출력용 기본 스트림
            // 두번째 매개변수에 true를 넣어주면 기존 내용을 유지하고 이어서 쓸 수 있다.
            FileOutputStream fos = new FileOutputStream("test.dat");
            // 문자열과 기본 자료형 값을 외부로 보낼 수 있는 형태로 가공해주는 스트림
            DataOutputStream dos = new DataOutputStream(fos);
            // 외부로 데이터를 보낸다.
            dos.writeInt(100);
            dos.writeDouble(11.11);
            dos.writeBoolean(true);
            dos.writeUTF("안녕하세요");
            // 파일을 닫아준다.
            dos.flush();
            dos.close();
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        // 읽어오기
        try {
            // 파일에서 데이터를 읽어오기 위한 스트림
            // 만약 지정된 이름의 파일이 없으면 오류가 발생한다.
            FileInputStream fis = new FileInputStream("test.dat");
            // 기본스트림으로 읽어온 데이터를 개발자가 사용할 수 있는 형태로 변환해주는 필터 스트림
            DataInputStream dis = new DataInputStream(fis);
            // 데이터를 읽어온다.
            int data1 = dis.readInt();
            double data2 = dis.readDouble();
            boolean data3 = dis.readBoolean();
            String data4 = dis.readUTF();
            // 닫아준다.
            dis.close();
            fis.close();

            // 출력한다.
            System.out.printf("data1 : %d\n", data1);
            System.out.printf("data2 : %f\n", data2);
            System.out.printf("data3 : %s\n", data3);
            System.out.printf("data4 : %s\n", data4);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}