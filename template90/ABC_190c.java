package template90;

import java.util.Scanner;

import java.util.HashMap;
//AC
public class ABC_190c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] data = new int[m][2];
        for(int i = 0; i < m; i++){
            data[i][0] = sc.nextInt();
            data[i][1] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] c = new int[k];
        int[] d = new int[k];
        for(int i = 0; i < k; i++){
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        HashMap<Integer,Boolean> num = new HashMap<>();
        HashMap<Integer,Boolean> init = new HashMap<>();
        for(int i = 1; i <= n; i++){
            init.put(i, false);
        }
        int temp = 0, max = 0;
        //i < 1 << kでも可能
        //https://qiita.com/aja_min/items/2a94758cf58fc1ea6f65
        for(int i = 0; i < Math.pow(2, k); i++){
            num.putAll(init);
            temp = 0;
            for(int j = 0; j < k; j++){
                if((1 & i >> j) == 1){
                    num.put(d[j], true);
                    //System.out.println(i);
                }else{
                    num.put(c[j], true);
                    //System.out.println(i);
                }
            }
            for(int j = 0; j < m; j++){
                if(num.get(data[j][0]) && num.get(data[j][1])){
                    temp++;
                }
            }
            if(max < temp){max = temp;}
            //System.out.println(num.get(3));
        }
        System.out.println(max);
        sc.close();
    }

}
