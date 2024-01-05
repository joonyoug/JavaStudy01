import java.util.Scanner;

public class Problem2 {
    static int checkChash(int input){
        int cashBack=0;
        if(input>=3000){
            cashBack=300;
        }
        else if(1000<=input&&input<3000){
            while(input>=10){
                input=input/10;
            }
            cashBack=input*100;

        }
        else{
            cashBack=0;
        }
        return cashBack;


    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요");
        int input=sc.nextInt();
        int cashBack=Problem2.checkChash(input);
        System.out.println("결제금액은"+input+"캐시백은"+cashBack+"원 입니다.");

    }
}
