package Other;

import java.util.*;

public class A02_HashMap {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("선동열", 140);
        map.put("류현진", 130);
        map.put("임창용", 135);
        map.put("오승환", 147);
        map.put("박찬호", 137);

        //enterySet() 은 map에 정의된 key값과 value값을 다 가져옵니다.
        Set set = map.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("Name: " + e.getKey() + ", Score: " + e.getValue());
        }

        //KeySet() 는 key 를 다 가져옵니다.
        set = map.keySet();
        System.out.println("참가자 명단: " + set);

        Collection<Integer> values = map.values();
        it = values.iterator();

        int total = 0;

        while(it.hasNext()) {
            Integer i = (Integer)it.next();
            total += i.intValue();
        }

        System.out.println("구속의 합: " + total);
        System.out.println("팀 평균: " + (float)total/set.size());
        System.out.println("최고 구속: " + Collections.max(values));
        System.out.println("최저 구속: " + Collections.min(values));
    }
}
