public class Problem1 {
    public static void main(String[] args){

            for(int i=1;i<=9;i++){
                for(int j=1;j<=9;j++){
                    System.out.print(String.format("0%d x 0%d = %02d   ",j,i,i*j));
                }
                System.out.println();
            }


    }
}
