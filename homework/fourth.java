package homework;
import java.util.Scanner;
public class fourth {
    public static void main(String[] args){
        System.out.println("请输入 10 个数字: ");
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        for(int i = 0; i < 10; i ++){
            array[i] = input.nextDouble();
        }
        System.out.println("最小元素的下标值为:\n" +
                indexOfSmallestElement(array));
    }
    public static int indexOfSmallestElement(double[] array){
        double min = array[0];
        int indexOfSmallestElement = 0;
        for(int i = 1; i < 10; i++){
            if(array[i] < min){
                min = array[i];
                indexOfSmallestElement = i;
            }
        }
        return indexOfSmallestElement;
    }
}
