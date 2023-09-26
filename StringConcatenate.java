    import java.util.*;

    public class StringConcatenate{
        public static void main(String[] args) {
            
            System.out.println("enter two string");

            Scanner sc = new Scanner (System.in);
            String m = sc.next();

            String b = sc.next();

                String o = m.concat(b);

                System.out.println(o);
            }
        }

