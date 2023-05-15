package Internsavy;


import java.util.Scanner;

    public class CurrencyConverter {

        public static void main(String[] args) {

            double amount;
            String fromCurrency;
            String toCurrency;
            double exchangeRate;
            double convertedAmount;

            Scanner input = new Scanner(System.in);

            System.out.println("Welcome to Currency Converter!");
            System.out.print("Enter amount to convert: ");
            amount = input.nextDouble();
            System.out.print("Enter currency to convert from (e.g. USD): ");
            fromCurrency = input.next().toUpperCase();
            System.out.print("Enter currency to convert to (e.g. EUR): ");
            toCurrency = input.next().toUpperCase();

            // Get exchange rate from API or database
            exchangeRate = getExchangeRate(fromCurrency, toCurrency);

            // Convert amount
            convertedAmount = amount * exchangeRate;

            // Display result
            System.out.printf("%.2f %s = %.2f %s", amount, fromCurrency, convertedAmount, toCurrency);
        }

        public static double getExchangeRate(String fromCurrency, String toCurrency) {
            // Get exchange rate from API or database and return it
            // This is just a placeholder function
            return 0.82;
        }
    }


