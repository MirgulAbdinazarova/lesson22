package homeworke22;

import java.io.Console;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
       Random random=new Random();
        ArrayList<Integer>arr=new ArrayList<>();
        int sch=0;
        int num=1;
        for (int i = 0; i <50; i++) {
            arr.add(i, random.nextInt(1, 101));
            System.out.println(num+":"+arr.get(i));
            sch++;
            num++;
        }
        System.out.println("Baary:"+sch);





    }
}
