class ternary
{
    public static void main(String args[])
    {
        int a=3;
       
        String p=a%2==0?"1":"0";
       
         if(p=="1")
        {
            System.out.println("a is even");
        }
        else if(p=="0")
        {
            System.out.println("a is odd");
        }
    }
}