package Other;

import java.util.HashMap;
import java.util.Scanner;

public class A01_HashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("lake0019", "1234");
        map.put("rmaqlctnekf", "1234");
        map.put("asdf", "1111");

        Scanner s = new Scanner(System.in);

        while(true) {
            String id, pw;
            System.out.println("ID 와 Password 를 입력해주세요. \n");

            System.out.print("ID: ");
            id = s.nextLine().trim();  //trim: 앞 뒤 공백을 제거해줌.

            System.out.print("PW: ");
            pw = s.nextLine().trim();

            System.out.println();


            /*
             *
             *  boolean containsKey(Object key)
             *  설명: 지정된 key 객체와 일치하는 Map 의 key 객체가 있는지 확인
             *
             */
            if(map.containsKey(id)) {
                if((map.get(id)).equals(pw)) {
                    System.out.println("id 와 password 가 일치합니다. \n");
                    break;
                } else {
                    System.out.println("password 가 일치하지않습니다. 다시 입력하세요. \n");
                }
            } else {
                System.out.println("입력하신 ID가 없습니다. 다시 입력해주세요 \n");
            }
        }

    }
}
