package ABC258;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] data = new String[n];

        for(int i = 0;i < n; i++){
            data[i] = sc.next();
        }

        int[][] num = new int[n][n];
        int[] start_x= new int[n];
        Arrays.fill(start_x, -1);
        int[] start_y= new int[n];
        Arrays.fill(start_y, -1);
        int max=0;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                num[i][j] = Character.getNumericValue(data[i].charAt(j));
                if(num[i][j] > max){
                    max = num[i][j];
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(num[i][j] == max){
                    start_x[count] = i;
                    start_y[count] = j;
                    count ++;
                }
            }
        }

        String[] ans = new String[count];
        Arrays.fill(ans, String.valueOf(max));
        for(int roop = 0;roop < count ;roop++){
            int x = start_x[roop];
        int y = start_y[roop];
        int index_x, index_y;
        int max_x=-1,max_y=-1;
        //System.out.print(num[start_x[roop]][start_y[roop]]);
        //System.out.print("start_x:"+start_x);
        //System.out.println("start_y:"+start_y);
        for(int i = 0;i <n-1;i++){
            max = 0;
            for(int o = -1; o < 2 ; o++ ){
                index_x = x+o;
                if(index_x >= n){
                    index_x = 0;
                }
                if(index_x < 0){
                    index_x = n-1;
                }
                //System.out.print("index_x:"+index_x);
                for(int p = -1; p < 2 ; p++ ){
                    index_y = y + p;
                    if(index_y >=n){
                        index_y = 0;
                    }
                    if(index_y < 0){
                        index_y = n-1;
                    }
                    //System.out.println("index_y:"+index_y);
                    if(num[index_x][index_y]> max || (index_x != x && index_y != y)){
                        max = num[index_x][index_y];
                        max_x = index_x;
                        max_y = index_y;
                    }
                }
            }
            x = max_x;
            y = max_y;
            ans[roop] += String.valueOf(max);
        }
        }
        int temp;
        for(int i = 0; i <count ;i++){
            temp = Integer.parseInt(ans[i]);
            if(max<temp){
                max = temp;
            }
        }
        System.out.println(max);
    }
}
