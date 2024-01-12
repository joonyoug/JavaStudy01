import java.util.Random;
import java.util.Scanner;

public class Problem4 {

    static String Number(String year,String month,String date,String sex){
        Random ram=new Random();


        if(Integer.parseInt(month)<10){
            month="0"+month;
        }
        if (Integer.parseInt(date)<10){
            date="0"+date;
        }
        String number=year.substring(2)+month+date+"-";

        if(sex.equals("m")){
            number+=3;
        }
        else if(sex.equals("f")){
            number+=4;
        }
        for(int i=0;i<6;i++){
            int num=ram.nextInt(10);
            number+=Integer.toString(num);

        }

        return number;
    }


    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.println("[주민등록번호 계산]");
        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        String year=sc.next();
        System.out.print("출생월을 입력해 주세요(mm):");
        String month=sc.next();
        System.out.print("충생일을 입력해 주세요(dd):");
        String date=sc.next();
        System.out.print("성별을 입력해 주세요(m/f):");
        String sex=sc.next();
        String number=Problem4.Number(year,month,date,sex);
        System.out.println(number);



    }
}
