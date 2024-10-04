import java.text.NumberFormat;
import java.util.Scanner;
//Mortgage calculator.
class Mortgage {
    public static void mortgage(String[] args){
        int principle = (int) (readNumber("Principle: ", 1000, 1_000_000));
        float annualInterest = (float) (readNumber("Annual interest rate: ", 0, 30));
        byte years = (byte) (readNumber("Period: ", 0, 30));

        double mortgage = calculateMortgage(principle, annualInterest, years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
    public static double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;

        while (true){
            System.out.print(prompt);
            value = scanner.nextDouble();
            if(value>=min && value<=max)
                break;
            System.out.println("Enter principle between" + min + "and " +max);
        }
        return value;
    }
    public static double calculateMortgage(int principle, float annualInterest, byte years){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        short numberOfPayments = (short) (years*MONTHS_IN_YEAR);
        float monthlyInterest = annualInterest/ MONTHS_IN_YEAR / PERCENT;

        double mortgage = (double) (principle*Math.pow((1+monthlyInterest),numberOfPayments)/Math.pow((1+monthlyInterest),numberOfPayments)-1);
        return mortgage;

    }
}