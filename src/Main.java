import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hur många studerande är vi idag? ");
        int numberOfStudents = scanner.nextInt();
        boolean goodMood = true;

        if (numberOfStudents == 33) {
            System.out.println("Alla verkar vara här idag");
            if (goodMood) {
                System.out.println("Alla verkar dessutom vara glada idag");
            }
        }

        else if (numberOfStudents > 33) {
            System.out.println("Någon i klassrummet verkar ha hamnat fel");
        }

        else if (numberOfStudents < 33) {
            System.out.println("Det fattas några elever idag");
        }

        else {
            System.out.println("Nu blev det fel");
        }
    }
}
