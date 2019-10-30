import java.util.Scanner;
public class M2Q15{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        double n =scn.nextInt();
        double sum =0;
    for(double i = 1 ; i<2*n ;i+=2){
        sum = sum+1/(i*(i+1));
    }
   System.out.println(sum);
    }
}
