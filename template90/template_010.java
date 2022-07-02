package template90;
import java.util.Scanner;

public class template_010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] c = new int[2][n];
        for(int i = 0; i < n; i++){
            c[0][i] = sc.nextInt();
            c[1][i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int l,r;
        double sum1,sum2;
        //System.out.println("----------------------------");
        for(int i = 0; i < q; i++){
            l = sc.nextInt();
            r = sc.nextInt();
            sum1 = 0;
            sum2 = 0;
            for(int j = l-1; j < r; j++){
                if(c[0][j] == 1){
                    sum1 += c[1][j];
                    //System.out.println("sum1:"+sum1);
                }
                if(c[0][j] == 2){
                    sum2 += c[1][j];
                    //System.out.println("sum2:"+sum2);
                }
            }
            System.out.println((int)sum1+" "+(int)sum2);
            sc.close();
        }
    }
}