public class Test {
    public static void main(String[] args) {
        int[][] values = {
            {3, 4, 5, 1}, 
            {33, 6, 1, 2}
        };

        for (int row = 0; row < values.length; row++) {
            java.util.Arrays.sort(values[row]);
            for (int column = 0; column < values[row].length; column++)
                System.out.print(values[row][column] + " ");
            System.out.println();
        }
    }
}