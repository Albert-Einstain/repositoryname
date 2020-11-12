public class HomeExercise {
    public static void main(String[] args) {
        int first = 45;
        int second = 10;
        int third = 100;
        if (first < second && first < third && second < third) {
            System.out.println (first + " " + second + " " + third);
        } else if (second < first && second < third && first < third) {
            System.out.println (second + " " + first + " " + third);
        } else if (third < first && third < second && first < second) {
            System.out.println (third + " " + first + " " + second);
        }
    }
}