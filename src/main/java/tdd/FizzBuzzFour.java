package tdd;

public class FizzBuzzFour {
    private static int number;

    public FizzBuzzFour(int number) {
        this.number = number;
    }

    public static String of(int number) {
        FizzBuzzFour fizzBuzzFour = new FizzBuzzFour(number);
        if (fizzBuzzFour.isDivisibleBy(3) && fizzBuzzFour.isDivisibleBy(5)) {
            return "FizzBuzz";
        }
        if (fizzBuzzFour.isDivisibleBy(3)||FizzBuzzFour.contains(3)) {
            return "Fizz";
        }
        if (fizzBuzzFour.isDivisibleBy(5)||FizzBuzzFour.contains(5)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private static boolean contains(int i) {
        return String.valueOf(number).contains(String.valueOf(i));
    }

    private boolean isDivisibleBy(int i) {
        return this.number % i == 0;
    }
}
