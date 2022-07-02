package ABC258;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int h = 21;
        int m = 0;
        if(k >= 60){
            h = 22;
            m = k - 60;
        }else{
            m = k;
        }
        if(m < 10){
            System.out.println(h+":0"+m);
        }else{
            System.out.println(h+":"+m);
        }
    }
}