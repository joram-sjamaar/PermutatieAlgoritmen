import utils.Numbers;

public class RandomPerm {

    private int N = 1000;

    public static void main(String[] args) {
        new RandomPerm().run();
    }

    private void run() {
        int[] numbers = new int[N];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Numbers.generateNumber(N, numbers);

            if (i != numbers.length - 1)
                System.out.printf("%d, ", numbers[i]);
            else
                System.out.printf("%d", numbers[i]);
        }

    }

}
