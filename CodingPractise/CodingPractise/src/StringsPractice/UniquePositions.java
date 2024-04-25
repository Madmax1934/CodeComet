package StringsPractice;

import java.util.HashSet;
import java.util.Set;

public class UniquePositions {
    public static void main(String[] args) {
        String moves = "FBFF";
        Set<Integer> hs = new HashSet<>();
        int pos=0;
        hs.add(pos);
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='F')
                pos++;
            else
                pos--;
            hs.add(pos);
        }
        System.out.println(hs.size());
    }
}
