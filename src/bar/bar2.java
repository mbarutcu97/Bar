import java.util.Scanner;

public class bar2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter length of sequence: ");
        int lengthOfSequence = input.nextInt();
        int[] array = new int[lengthOfSequence];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Please enter number: ");
            array[i] = input.nextInt();
        }

        input.close();

        printAsterisks(array);
    }

    public static void printAsterisks(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 40) {
                System.out.println("****************************************");
            } else {
                for (int j = 0; j < array[i]; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}