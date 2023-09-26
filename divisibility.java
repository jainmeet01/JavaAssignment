import java.util.*;

public class divisibility {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        if(n%5== 0&& n%11==0){
            System.out.print("it is divisible by 5 and 11");

        }else{
            System.out.print("it is not divisible by 5 and 11");

        }
        sc.close();
}
}