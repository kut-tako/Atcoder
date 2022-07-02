package ABC258;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int n = sc.nextInt();
        int[] dx = {-1,-1,-1,0,0,1,1,1};
        int[] dy = {-1,0,1,-1,1,-1,0,1};
        String[] data = new String[n];
        int[][] num = new int[n][n];
        String temp ="";
        String ans="0";
        int max=0,x=0,y=0;
        for(int i = 0; i < n; i++){
            data[i] = sc.next();
            for(int j = 0; j < n; j++){
                num[i][j] = Character.getNumericValue(data[i].charAt(j));
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                for(int d = 0;d <8;d++){
                    sb.setLength(0);
                    for(int k = 0; k <n; k++){
                        if((i+dx[d]*k) < 0){
                            x = n+(i+dx[d]*k);
                        }else{
                            x = (i+dx[d]*k)%n;
                        }
                        if((j+dy[d]*k) < 0){
                            y = n+(j+dy[d]*k);
                        }else{
                            y = (j+dy[d]*k)%n;
                        }
                        //System.out.println("d:"+d+" x:"+x+" y:"+y);
                        sb.append(String.valueOf(num[x][y]));
                    }
                    temp = sb.toString();
                    //System.out.println(temp);
                    if(ans.compareTo(temp) < 0 ){
                        ans = temp;
                        //System.out.println(ans);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
