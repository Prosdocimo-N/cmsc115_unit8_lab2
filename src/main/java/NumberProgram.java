public class NumberProgram {

    public static int findResult(int[] values) {
        if (values.length == 0) {
            return Integer.MIN_VALUE;
        }

        int largest = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > largest) {
                largest = values[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        System.out.println("Run NumberProgramTest using JUnit.");
    }
}