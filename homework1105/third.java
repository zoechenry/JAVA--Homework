package homework1103;

import java.util.ArrayList;
import java.util.Scanner;

public class third {
    public static void main(String[] args){
        ArrayList<Number> list = new ArrayList<>();
        System.out.println("请输入数字(结束输入时请输0.0)：");
        Scanner input = new Scanner(System.in);
        Number num = input.nextDouble();
        while(num.doubleValue() != 0.0){
            list.add(num);
            num = input.nextDouble();
        }
        sort(list);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }

    public static void sort(ArrayList<Number> list){
        for(int i=0;i<list.size();i++){
            Number minNum = list.get(i);
            int minNumIndex = i;
            for(int j=i+1;j<list.size();j++){
                if(minNum.doubleValue() > list.get(j).doubleValue()){
                    minNum=list.get(j);
                    minNumIndex = j;
                }
            }
            if(minNumIndex != i){
                list.set(minNumIndex,list.get(i));
                list.set(i,minNum);
            }


        }
    }



}
