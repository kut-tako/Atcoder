package template90;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class t_027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> name = new HashMap<>();
        String temp;
        int count = 0;
        for(int i = 0; i < n; i++){
            temp = sc.nextLine();
            if(name.containsKey(temp) != true){
                count++;
            }
            name.put(temp, i);
        }
        System.out.println(count);

        sc.close();
    }
}
