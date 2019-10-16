package tdd;

public class FizzBuzzTwo {
    private int number;

    public FizzBuzzTwo(int number) {

        this.number = number;
    }

    public static String of(int number) {
        FizzBuzzTwo fizzBuzzTwo = new FizzBuzzTwo(number);
        if (fizzBuzzTwo.isDivisible(3) && fizzBuzzTwo.isDivisible(5)) {
            return "FizzBuzz";
        }
        if (fizzBuzzTwo.isDivisible(3)  || fizzBuzzTwo.contains(3)) {
            return "Fizz";
        }
        if (fizzBuzzTwo.isDivisible(5)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private boolean isDivisible(int i) {
        return this.number % i == 0;
    }
}
