import java.util.Scanner;

class FuelCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char calculateAgain;

        do {
            double gallonsInTank;
            do {
                System.out.print("Enter the number of gallons of gas in the tank: ");
                gallonsInTank = scanner.nextDouble();
            } while (gallonsInTank < 0);

            double fuelEfficiency;
            do {
                System.out.print("Enter the fuel efficiency in miles per gallon: ");
                fuelEfficiency = scanner.nextDouble();
            } while (fuelEfficiency <= 0);

            double pricePerGallon;
            do {
                System.out.print("Enter the price of gas per gallon: $");
                pricePerGallon = scanner.nextDouble();
            } while (pricePerGallon < 0);

            double costPer100Miles = (100.0 / fuelEfficiency) * pricePerGallon;

            double milesCanGo = gallonsInTank * fuelEfficiency;

            System.out.printf("Cost per 100 miles: $%.2f%n", costPer100Miles);
            System.out.printf("Miles the car can go with the gas in the tank: %.2f miles%n", milesCanGo);

            System.out.print("Calculate again? (Y/N): ");
            calculateAgain = scanner.next().charAt(0);
        } while (calculateAgain == 'Y' || calculateAgain == 'y');

        System.out.println("Thanks for using the Fuel Cost Calculator!");
        scanner.close();
    }
}
