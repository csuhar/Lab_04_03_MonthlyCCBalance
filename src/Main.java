public class Main {
    public static void main(String[] args) {

        double ccBalance = 5000.00;
        double annualInterestRate = 0.17;


        double interestRateMonth1 = ccBalance * annualInterestRate;

        double interestRateMonth2 = (ccBalance + interestRateMonth1) * annualInterestRate;

        System.out.println("The interest accrued on your credit card after one month is: $" + interestRateMonth1);
        System.out.println("The interest accrued on your credit card after two months is: $" + interestRateMonth2);



    }
}