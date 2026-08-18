public class NumberProgram {

    public static int findResult(int[] values) {
        int result = 0;

        for (int value : values) {
            result += value;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Run NumberProgramTest using JUnit.");
    }
}