import java.util.*;

public class Checknegative {
    
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System .out.print("Enter the number:");
        int n = sc.nextInt();

        if(n<0) {
            System.out.print("is a negative number");
 

        }else{
            System.out.print("is not a positive number");
        }
        sc.close();






}
}

//to reverse the condition to positive(n>0)

//condition (n<0) 
//conditon zero (n=0)