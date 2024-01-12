import java.util.Random;
import java.util.Scanner;

public class Problem6 {


    public static void main(String []args){
        Random rd=new Random();
        Scanner sc=new Scanner(System.in);
        int total;
        int elected=0;
        int num;
        int choice=0;
        String []member;
        int cnt;
        while(true){
            System.out.print("진행할 투표수를 입력해 주세요. ");
            total=sc.nextInt();
            if(total<1||total>1000){
                System.out.println("투표수 오류 다시입력 하시오.");
                continue;
            }
            System.out.print("가상 선거를 진행할 후바자 인원을 입력해 주세요. ");
            num=sc.nextInt();
            if(num<2||num>10){
                System.out.println("후보자수 오류");
                continue;
            }
            cnt=1;
            member=new String[num];
            elected=0;
            for(int i=0;i<num;i++){
                System.out.print(i+1+"번째 후보자이름을 입력해 주세요.");
                member[i]=sc.next();
                if(member[i].length()>=10){
                    System.out.println("후보자 이름 오류");
                    continue;
                }
            }
            break;
        }
        int []member_input=new int[num];
        int vote;
        double now=(double)cnt/(double)total*100.0;
        while(cnt<=total){
            vote= rd.nextInt(num);
            member_input[vote]++;
            System.out.printf("[투표진행률]: %.2f%%,%d명 투표==>%s\n",now,cnt,member[vote]);
            for(int i=0;i<num;i++){
                System.out.printf("[기호:%d] %s:   %.2f%%  (투표수: %d)\n",i+1,member[i],(double)member_input[i]/(double)total*100.0,member_input[i]);
            }
            cnt++;
            now=(double)cnt/(double)total*100.0;

        }

        for(int i=0;i<num;i++){
            if(elected<member_input[i]){
                elected=member_input[i];
                choice=i;
            }
        }
        System.out.println("[투표결과] 당선인 :"+member[choice]);





    }
}
