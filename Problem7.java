import java.util.*;

public class Problem7 {

    static ArrayList makeLottoNumber(){  //로또 번호 생성
        HashSet set=new HashSet<>();
        Random rd=new Random();
        for(int i=0;i<6;i++){
            int num= rd.nextInt(45)+1;
            set.add(num);
        }
        if(set.size()!=6) {
            while (true) {
                int num= rd.nextInt(45)+1;
                set.add(num);
                if(set.size()==6){
                    break;
                }
            }
        }
        ArrayList LotteNumber=new ArrayList(set);
        Collections.sort(LotteNumber);
        return LotteNumber;
    }
    static void printLotto(int num,ArrayList[] lotto,ArrayList lottoNumber){ //로또번호 출력
        char a='A';
        for(int i=0;i<num;i++){
            System.out.print(a+"   ");
            for(int j=0;j<lotto[i].size();j++){
                if(j==5){
                    System.out.printf("%02d\n",lotto[i].get(j));
                }
                else{
                    System.out.printf("%02d,",lotto[i].get(j));
                }
            }
            a++;
        }
        System.out.print("[로또 발표]\n");
        System.out.print("    ");
        for(int i=0;i<lottoNumber.size();i++){
            if(i==5){
                System.out.printf("%02d\n",lottoNumber.get(i));
            }
            else{
                System.out.printf("%02d,",lottoNumber.get(i));
            }
        }
    }

    static void checkLotto(int num ,ArrayList[] lotto,ArrayList lottoNumber){ //로또 확인

        int ok[]=new int[num];

        for(int i=0;i<num;i++){
            for(int j=0;j<lottoNumber.size();j++){
                if(lotto[i].contains(lottoNumber.get(j))==true){
                    ok[i]++;
                }
            }
        }
        char a='A';
        for(int i=0;i<num;i++){
            System.out.print(a+"   ");
            for(int j=0;j<lotto[i].size();j++){
                if(j==5){
                    System.out.printf("%02d ==>%d 일치\n",lotto[i].get(j),ok[i]);
                }
                else{
                    System.out.printf("%02d,",lotto[i].get(j));
                }
            }
            a++;
        }
    }


    public static void main(String []args){

        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.print("로또 개수를 입력해 주세요:(숫자 1~10):");
            int num = sc.nextInt();
            if(num>10){
                System.out.println("10개이상 입력 불가");
                continue;
            }
            ArrayList[] lotto = new ArrayList[num]; //나의 로또번호
            for (int i = 0; i < num; i++) {
                lotto[i] = makeLottoNumber();
            }
            ArrayList lottoNumber = makeLottoNumber();//로또 번호
            printLotto(num, lotto, lottoNumber);
            checkLotto(num, lotto, lottoNumber);
            break;

        }





    }
}
