package homework1103;
import java.util.Date;

public class first {
    public static void main(String[] args){
        Date date = new Date();
        long l = 10000;
        for(int i = 0; i < 8; i++){
            date.setTime(l);
            System.out.println(l + ": " + date.toString());
            l *= 10;

        }
    }

}
