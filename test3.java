import java.util.*;

public class test3{  

    public static void main(String args[]){

        String s =  sc.next();

        String g = " ";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=12)
            {
                g = g+(char) (s.charAt(i)-32);
            }
            else{
            g = g+(char)(s.charAt(i) + 32);  
            }
            System.out.println(g);
        }  
       
    }
}    
   



