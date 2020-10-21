package homework;
import java.util.Scanner;
public class fifth {
    public static void main(String[] args) {
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        java.util.Scanner input = new Scanner(System.in);
        double[][] m= new double[4][4];
        for(int row = 0; row < m.length; row++){
            for(int column = 0; column < m[row].length; column++){
                m[row][column] = input.nextDouble();
            }
        }
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(m));
    }
    public static double sumMajorDiagonal(double[][] m) {
        double total = 0;
        for (int row = 0; row < m.length; row++) {
            total += m[row][row];
        }
        return total;
    }

}
