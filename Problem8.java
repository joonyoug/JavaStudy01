import java.util.Scanner;

public class Problem8 {


    static int tax(int input){
       int []tax={12000000,46000000,88000000,150000000,300000000,500000000,1000000000};
       int []taxRate={6,15,24,35,38,40,42,45};
       int myTax=0;
       boolean end=false;
       int i=0;

       while(true){
           if(i==7&&input-tax[6]>0){ //10억이상인경우
               input=input-tax[i-1];
               myTax+=input/100*taxRate[7];
               System.out.printf("%13d * %2d%% =%12d\n",input,taxRate[7],input/100*taxRate[7]);
              // System.out.println("세율에 의한 세금  "+myTax);
               break;
           }
           else if(i==0&&input-tax[i]<0){ //1200만원보다 작은경우
               System.out.printf("%13d * %2d%% =%12d\n",input,taxRate[i],input/100*taxRate[i]);
               myTax=input/100*taxRate[i];
              // System.out.println("[세율에 의한 세금]  " + myTax);
               break;
           }
           else if(input-tax[i]<0){  //일반적인 경우 출력
               if(input-tax[i-1]==0){
                  // System.out.println("[세율에 의한 세금]  "+myTax);
               }
               else {
                   input=input-tax[i-1];
                   myTax+=input/100*taxRate[i];
                   System.out.printf("%13d * %2d%% =%12d\n", input, taxRate[i], input / 100 * taxRate[i]);
                  // System.out.println("[세율에 의한 세금]  " + myTax);
               }
               break;
           }
           else if(i==0){ //1200만원 계산
               System.out.printf("%13d * %2d%% =%12d\n",tax[i],taxRate[i],tax[i]/100*taxRate[i]);
               myTax+=tax[i]/100*taxRate[i];

           }
           else { //나머지 계산
               System.out.printf("%13d * %2d%% =%12d\n", tax[i] - tax[i - 1], taxRate[i], (tax[i] - tax[i - 1]) / 100 * taxRate[i]);
               myTax+=(tax[i]-tax[i-1])/100*taxRate[i];
           }
           i++;
       }

        return myTax;
    }
    static int Tax2(int input){

        int myTax=0;
        int []tax={0,1080000,5220000,14900000,19400000,25400000,35400000,65400000};
        int []taxRate={6,15,24,35,38,40,42,45};
        if(input-1000000000>0){
            myTax=input/100*taxRate[7]-tax[7];
          //  System.out.println("[누진공제 계산에 의한 세금]"+myTax);

        }
        else if(input-500000000>0){
            myTax=input/100*taxRate[6]-tax[6];
         //   System.out.println("[누진공제 계산에 의한 세금]"+myTax);
        }
        else if(input-300000000>0){
            myTax=input/100*taxRate[5]-tax[5];
          //  System.out.println("[누진공제 계산에 의한 세금]"+myTax);

        }
        else if(input-150000000>0){
            myTax=input/100*taxRate[4]-tax[4];
          //  System.out.println("[누진공제 계산에 의한 세금]"+myTax);
        }
        else if(input-88000000>0){
            myTax=input/100*taxRate[3]-tax[3];
          //  System.out.println("[누진공제 계산에 의한 세금]"+myTax);
        }
        else if(input-46000000>0) {
            myTax=input/100*taxRate[2]-tax[2];
           // System.out.println("[누진공제 계산에 의한 세금]"+myTax);
        }
        else if(input-12000000>0){
            myTax=input/100*taxRate[1]-tax[1];
           // System.out.println("[누진공제 계산에 의한 세금]"+myTax);
        }
        else{
            myTax=input/100*taxRate[0]-tax[0];
          //  System.out.println("[누진공제 계산에 의한 세금]"+myTax);
        }

        return myTax;

    }




    public static void main(String []args){

        Scanner sc=new Scanner(System.in);
        int input;
        System.out.println(" [과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.: ");
        input=sc.nextInt();
        int x=Problem8.tax(input);
        int y=Problem8.Tax2(input);
        System.out.println();
        System.out.printf("[세율에 의한 세금]:        %12d\n",x);
        System.out.printf("[누진공제 계산에 의한 세금]: %12d\n",y);






    }
}
