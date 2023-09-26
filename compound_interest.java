public class compound_interest {
    public static void main(String[] args) {
        double principal = 25000;
        double rate =0.05;
        int n = 10;
        int years = 5;
        double amount = principal * Math.pow(1 + (rate / n), n* years);
        double compoundInterest = amount - principal;
        System.out.println("The compound interest is:"+ compoundInterest);
    }
}