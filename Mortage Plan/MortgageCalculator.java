import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        try {
            File file = new File("prospects.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String customerName = parts[0];
                double totalLoan = Double.parseDouble(parts[1]);
                double yearlyInterestRate = Double.parseDouble(parts[2]);
                int numberOfYears = Integer.parseInt(parts[3]);

                double monthlyPayment = calculateMonthlyPayment(totalLoan, yearlyInterestRate, numberOfYears);

                System.out.println("Prospect: " + customerName + " wants to borrow " + totalLoan + "€ for a period of " +
                        numberOfYears + " years and pay " + monthlyPayment + "€ each month");
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static double calculateMonthlyPayment(double totalLoan, double yearlyInterestRate, int numberOfYears) {
        double monthlyInterestRate = yearlyInterestRate / 100 / 12;
        int numberOfPayments = numberOfYears * 12;

        double monthlyPayment = totalLoan * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments) /
                (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        return monthlyPayment;
    }
}

