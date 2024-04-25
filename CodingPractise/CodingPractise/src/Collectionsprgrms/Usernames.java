package Collectionsprgrms;

import java.util.*;

public class Usernames {

    public static void main(String[] args) {
        Map<String,String> hm = new HashMap<String,String>();
        hm.put("etiki123@google.com","eteki");
        hm.put("sursan123@gmail.com","Sursan");
        hm.put("samson123@gmail.com","Samson");
        hm.put("sursan111@gmail.com","Sursan");
        hm.put("etiki1223@google.com","eteki");

        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        set.addAll(hm.values());
        int count=0;
        for(Map.Entry<String,String> en: hm.entrySet()){
            System.out.println("loop count = "+count++);
            Iterator<String> itr = set.iterator();
            while(itr.hasNext()){
                if(itr.next().equals(en.getValue()))
                {
                    list.add(en.getKey());
                }
            }
            System.out.println(en);

        }
    }

}
