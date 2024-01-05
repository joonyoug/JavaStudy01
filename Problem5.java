
import sun.util.resources.LocaleData;


import java.time.LocalDate;
import java.util.Scanner;

public class Problem5 {


    static void printTitleCal(int year,int month) {

        int month1 = month - 1;
        if(month1==0){   //1월달 입력 경우
            year--;
            month1=12;
        }
        for (int i = 0; i < 3; i++) {

            System.out.printf(" [%d년 %d월]\t\t\t\t\t\t\t\t\t", year, month1);
            month1++;
            if(month1==13){     // 12월달 입력경우
                month1=month1-12;
                year++;
            }
        }
        System.out.println();

    }
    static void printDay(){

        for(int i=0;i<3;i++){
            System.out.printf("일\t월\t화\t수\t목\t금\t토");
            System.out.print("\t\t\t\t\t\t");
        }
        System.out.println();
    }
    static void printDate(int year,int month){
        int month1 = month - 1;
        int date = 1;
        int []lastday1=new int[3];    //말일 변수
        int []day1=new int[3];        //2번째 줄 시작지점

        if(month1==0){   //1월달 입력 경우
            year--;
            month1=12;
        }

        for(int i=0;i<3;i++){
            LocalDate Local=LocalDate.of(year,month1,date);
            lastday1[i]=Local.lengthOfMonth();
            day1[i]=firstLine(year,month1);
            month1++;
            if(month1==13){     // 12월달 입력경우
                month1=month1-12;
                year++;
            }


        }

        System.out.println();

        for(int i=0;i<4;i++){
            for(int j=0;j<21;j++){
                if(j<7){
                    if(j==6){
                        if(lastday1[0]<day1[0]){
                            System.out.printf("  ");
                        }
                        else{
                            System.out.printf("%02d", day1[0]);
                        }

                        System.out.print("\t\t\t\t\t\t");
                    }
                    else {
                        if(lastday1[0]<day1[0]){
                            System.out.printf("\t");
                        }
                        else{
                            System.out.printf("%02d\t", day1[0]);
                        }
                    }
                    day1[0]++;
                }
                else if(j<14){

                    if(j==13){
                        if(lastday1[1]<day1[1]){
                            System.out.printf("  ");
                        }
                        else{
                            System.out.printf("%02d", day1[1]);
                        }
                        System.out.print("\t\t\t\t\t\t");
                    }
                    else{
                        if(lastday1[1]<day1[1]){
                            System.out.printf("\t");
                        }
                        else{
                            System.out.printf("%02d\t", day1[1]);
                        }
                    }
                    day1[1]++;

                }
                else if(j<21){

                    if(j==20){
                        if(lastday1[2]<day1[2]){
                            System.out.printf("  ");
                        }
                        else{
                            System.out.printf("%02d", day1[2]);
                        }
                        System.out.println();
                    }
                    else{
                        if(lastday1[2]<day1[2]){
                             System.out.printf("\t");
                        }
                        else{
                            System.out.printf("%02d\t", day1[2]);
                        }
                    }
                    day1[2]++;
                }

            }
        }

    }
    static int firstLine(int year,int month) {

        int date = 1;
        int cnt = 0;
        LocalDate Date = LocalDate.of(year, month, date); //년,월,일
        int day = Date.getDayOfWeek().getValue(); // 요일을 숫자로 반환 월~일 1~7

        if (day == 7) {
        } else {
            for (int i = 0; i < day; i++) {

                System.out.print(" \t");
                cnt++;
            }
        }
        for (int i = 0; i < 7-cnt; i++) {

            if ((cnt + date) % 7 == 0) {

                System.out.printf("%02d", date);
                System.out.print("\t\t\t\t\t\t");


            } else {
                System.out.printf("%02d\t", date);
            }
            date++;
        }
        return date;


    }
        public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        while(true) {
                System.out.println("[달력 출력 프로그램]");
                System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
                int year = sc.nextInt();
                if(year<0){
                    System.out.println("다시 입력해주세요");
                    continue;
                }
                System.out.print("달력의 월을 입력해 주세여(mm):");
                int month = sc.nextInt();
                if(month<1||month>12){
                    System.out.println("다시 입력해주세요");
                    continue;
                }
                Problem5.printTitleCal(year, month);
                Problem5.printDay();
                Problem5.printDate(year, month);
                break;

            }



    }
}
