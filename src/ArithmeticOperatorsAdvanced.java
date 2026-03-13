public class ArithmeticOperatorsAdvanced {

    // Temperature converter using arithmetic
    static double celsiusToFahrenheit(double c) { return (c * 9.0 / 5.0) + 32; }
    static double fahrenheitToCelsius(double f) { return (f - 32) * 5.0 / 9.0; }

    // Check even/odd using modulus
    static String evenOrOdd(int n) { return n % 2 == 0 ? "even" : "odd"; }

    // Extract digits using arithmetic
    static void digitExtractor(int n) {
        System.out.println("\nDigits of " + n + ":");
        int original = Math.abs(n);
        if (original == 0) { System.out.println("  0"); return; }
        while (original > 0) {
            System.out.print("  " + original % 10);
            original /= 10;
        }
        System.out.println();
    }

    // Compound interest: A = P(1 + r/n)^(nt)
    static double compoundInterest(double principal, double rate, int times, int years) {
        return principal * Math.pow(1 + rate / times, times * years);
    }

    public static void main(String[] args) {
        System.out.println("=== Temperature Conversion ===");
        double[] celsius = {0, 20, 37, 100, -40};
        for (double c : celsius) {
            System.out.printf("%.1f°C = %.2f°F%n", c, celsiusToFahrenheit(c));
        }

        System.out.println("\n=== Even/Odd Checker ===");
        int[] nums = {4, 7, 0, -13, 100};
        for (int n : nums) System.out.printf("%4d is %s%n", n, evenOrOdd(n));

        digitExtractor(4829);

        System.out.println("\n=== Compound Interest Calculator ===");
        System.out.printf("Principal $1000 | 5%% | 12x/year | 10 years → $%.2f%n",
            compoundInterest(1000, 0.05, 12, 10));
        System.out.printf("Principal $5000 | 3%% | 1x/year  |  5 years → $%.2f%n",
            compoundInterest(5000, 0.03, 1, 5));
    }
}
