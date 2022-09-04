package homeworke22;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        // жуп сандар

        ArrayList<Integer> list=new ArrayList<>();
        int sch1=0;
        for (int j = 0,n=0; j < 50; j++) {
            list.add(j,n+=2);
            System.out.println(list.get(j));
            sch1++;
        }
        System.out.println("Itogo:"+sch1);

    }
}
