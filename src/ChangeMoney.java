import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double rate = 23000;
        double USD = 0;
        while (USD!=-1){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your money USD: ");
            USD = input.nextDouble();
            double VND = rate*USD;
            System.out.println("Value VND: "+ VND);

        }
    }
}
