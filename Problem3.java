import java.util.Scanner;

public class Problem3 {

    static  int checkCharges(int age,int time,String check,String card){
        int charge=10000;
        if(age<3){
            charge=0;
        }
        else if(age<13){
            charge=4000;
        }
        else if(time>17){
            charge=4000;
        }
        else if(check.equals("y")||card.equals("y")){
            charge=8000;
        }

        return charge;

    }



    public  static  void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자입력):");
        int age=sc.nextInt();
        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int time=sc.nextInt();
        System.out.print("국가유공자 여부를 입력해 주세요.(y/n)");
        String check=sc.next();
        System.out.print("복지카드 여부를 입력해 주세요(y/n)");
        String card=sc.next();
        int charge=Problem3.checkCharges(age,time,check,card);
        System.out.println("입장료:"+charge);





    }
}
