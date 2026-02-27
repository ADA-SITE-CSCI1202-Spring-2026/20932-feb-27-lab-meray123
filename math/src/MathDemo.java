public class MathDemo {

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int sum(int[] args) {
        int total = 0;
        for (int i = 0; i < args.length; i++) {
            total += args[i];
        }
        return total;
    }

    public static float mean(int[] args) {
        int total = sum(args);
        return (float) total / args.length;
    }

    public static int fact(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println("Min of 5 and 3: " + min(5, 3));
        System.out.println("Max of 5 and 3: " + max(5, 3));

        int[] numbers = {2, 4, 6, 8};

        System.out.println("Sum: " + sum(numbers));
        System.out.println("Mean: " + mean(numbers));

        System.out.println("Factorial of 5: " + fact(5));
    }
}
