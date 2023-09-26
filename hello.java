import java.util.*;
public class hello{

    void sum(int a,int b){

        System.out.println(a+b);
    }
        static void area_of_cir(double r)
        {
        System.out.println(3.14*r*r);
        }
        public static void main(String args[]){

            Scanner sc=new Scanner(System.in);
            double d=sc.nextDouble();
            hello h=new hello();
            h.sum(5,6);
            area_of_cir(d);
            //System.out.println("Hello, World!");
            sc.close();
        }
            
}
      