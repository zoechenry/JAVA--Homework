package homework;
import java.util.Scanner;
public class first {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); System.out.println("请输入一个整数: ");
        int num = input.nextInt(); System.out.println("该整数反向显示的结果为:\n" + reverse(num));
    }
    public static int reverse(int num){
        int reverseNum = 0;
        while(num != 0){
            reverseNum = reverseNum * 10 + num % 10; num /= 10;
        }
        return reverseNum;
    }
}
