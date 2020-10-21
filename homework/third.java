package homework;
import java.util.Scanner;
public class third {
    public static void main(String[] args){
        int[] num = new int[100];
        int[] counts = new int[10];
        for(int i = 0; i < 100; i++){
            num[i] = (int)(Math.random() * 10);
        }
        for(int e: num){
            counts[e]++;
        }
        for(int j=0; j < 10; j++){
            System.out.println(j + "出现了" + counts[j] + "次");
        }
    }
}
