package homeworke22;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        // так сандар

        ArrayList<Integer> list=new ArrayList<>();
        int sch1=0;

        for (int j = 0, k=1; j < 50; j++) {
            if (k % 2 == 1){
                list.add(j, k);
            System.out.println(list.get(j));
                k+=2;
             }
            sch1++;

        }
        System.out.println("Itogo:"+sch1);



    }
}
