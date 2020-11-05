package homework1103;

import java.awt.*;
import java.util.Date;

public class second {
   private int id=0;
   private double balance=0;
   private double annualInterestRate=0;
   private Date dateCreated;
   public second(){
       super();
       this.dateCreated=new Date();
   }//创建默认账户
   public second(int id, double balance){
       super();
       this.id = id;
       this.balance = balance;
       this.dateCreated = new Date();
   }//创建带特定id和初始余额的账户

   //访问器和修改器
   public int getId(){
       return id;
   }
   public void setId(int id){
       this.id = id;
   }

   public double getBalance(){
       return balance;
   }
   public void setBalance(double balance){
       this.balance=balance;
   }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
       this.annualInterestRate=annualInterestRate;
    }
    public Date getDateCreated(){
       return dateCreated;
    }
    //返回月利率
    public  double getMonthlyInterestRate(){
       return annualInterestRate/12;
    }
    public double getMonthlyInterest(){return balance * getMonthlyInterestRate();}
    public void withDraw(double Num1){
       if(Num1 > this.balance){
           System.out.println("余额不足");
       }
       else{
           this.balance -= Num1;
       }
    }//取钱
    public void deposit(double Num2){
       this.balance += Num2;
    }//存钱

    public static void main(String[] args){
        second account = new second(1122, 20000);
        account.setAnnualInterestRate(4.5/100);
        account.withDraw(2500);
        account.deposit(3000);
        System.out.println("balance: "+account.getBalance());
        System.out.println("monthlyRate: "+account.getMonthlyInterest());
        System.out.println("createDate: "+account.getDateCreated());
    }
}
