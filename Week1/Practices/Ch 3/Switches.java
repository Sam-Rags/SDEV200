public class Switches {
    public static void main(String[] args) {
        int day = 1;

        System.out.println(
            switch (day) {
                case 1, 2, 3 -> day + " ";
                default -> " ";
            }
        );

    }
}
