import java.util.Scanner;

public class Bar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter length of sequence: ");
        int lengthOfSequence = input.nextInt();

        int[] numbers = new int[lengthOfSequence];
        String[] captions = new String[lengthOfSequence];
        for (int i = 0; i < lengthOfSequence; i++) {
            System.out.print("Please enter caption: ");
            captions[i] = input.next();
            System.out.print("Please enter number: ");
            numbers[i] = input.nextInt();

            if (numbers[i] < 0) {
                numbers[i] = -numbers[i];
            }
        }

        printElements(lengthOfSequence, captions, numbers);
        input.close();
    }

    public static void printElements(int length, String[] names, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%10s ", names[i]);

            for (int j = 0; j < numbers[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}