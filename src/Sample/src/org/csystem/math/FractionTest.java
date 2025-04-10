package org.csystem.math;

public class FractionTest {
    public static void run()
    {
        Fraction frac1 = new Fraction(4, 18); // 4 / 18
        System.out.println("frac1: " + frac1.toString());  // Beklenen: "2 / 9 = 0.222222"

        // 2. Pay ve Payda ayarlama
        frac1.setNumerator(5);
        frac1.setDenominator(15); // 5 / 15
        System.out.println("Updated frac1: " + frac1.toString());  // Beklenen: "1 / 3 = 0.333333"

        // 3. Add metodu testi (Kesirli)
        Fraction frac2 = new Fraction(1, 2); // 1 / 2
        Fraction resultAdd = frac1.add(frac2);  // 1/3 + 1/2 = 5/6
        System.out.println("frac1 + frac2: " + resultAdd.toString());  // Beklenen: "5 / 6 = 0.833333"

        // 4. Add metodu testi (Tam sayılı)
        Fraction resultAddInt = frac1.add(3);  // 1/3 + 3 = 10/3
        System.out.println("frac1 + 3: " + resultAddInt.toString());  // Beklenen: "10 / 3 = 3.333333"

        // 5. Subtract metodu testi (Kesirli)
        Fraction resultSubtract = frac1.subtract(frac2);  // 1/3 - 1/2 = -1/6
        System.out.println("frac1 - frac2: " + resultSubtract.toString());  // Beklenen: "-1 / 6 = -0.166667"

        // 6. Subtract metodu testi (Tam sayılı)
        Fraction resultSubtractInt = frac1.subtract(2);  // 1/3 - 2 = -5/3
        System.out.println("frac1 - 2: " + resultSubtractInt.toString());  // Beklenen: "-5 / 3 = -1.666667"

        // 7. Multiply metodu testi
        Fraction frac3 = new Fraction(2, 3); // 2 / 3
        Fraction resultMultiply = frac1.multiply(frac3);  // 1/3 * 2/3 = 2/9
        System.out.println("frac1 * frac3: " + resultMultiply.toString());  // Beklenen: "2 / 9 = 0.222222"

        // 8. Multiply metodu testi (Tam sayılı)
        Fraction resultMultiplyInt = frac1.multiply(4);  // 1/3 * 4 = 4/3
        System.out.println("frac1 * 4: " + resultMultiplyInt.toString());  // Beklenen: "4 / 3 = 1.333333"

        // 9. Divide metodu testi
        Fraction resultDivide = frac1.divide(frac3);  // 1/3 / 2/3 = 1/2
        System.out.println("frac1 / frac3: " + resultDivide.toString());  // Beklenen: "1 / 2 = 0.500000"

        // 10. Divide metodu testi (Tam sayılı)
        Fraction resultDivideInt = frac1.divide(2);  // 1/3 / 2 = 1/6
        System.out.println("frac1 / 2: " + resultDivideInt.toString());  // Beklenen: "1 / 6 = 0.166667"

        // 11. compareTo metodu testi
        Fraction frac4 = new Fraction(2, 5); // 2 / 5
        System.out.println("frac1 compareTo frac4: " + frac1.compareTo(frac4));  // Beklenen: "-1" (1/3 < 2/5)

        // 12. equals metodu testi
        Fraction frac5 = new Fraction(2, 6); // 2 / 6
        System.out.println("frac1 equals frac5: " + frac1.equals(frac5));  // Beklenen: "true" (1/3 == 2/6)

        // 13. inc() ve dec() metodları testi
        frac1.inc();  // 1/3 + 1 = 4/3
        System.out.println("frac1 incremented: " + frac1.toString());  // Beklenen: "4 / 3 = 1.333333"

        frac1.dec();  // 4/3 - 1 = 1/3 (geri dönecek)
        System.out.println("frac1 decremented: " + frac1.toString());  // Beklenen: "1 / 3 = 0.333333"
    }

    public static void main(String[] args)
    {
        run();
    }
}
