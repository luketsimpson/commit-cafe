public class CommitCafe {

<<<<<<< HEAD
    private static String barista = "Shrek"; // STUDENT_TODO_1A: Change name
    // STUDENT_TODO_1B: Add a nickname or title for the barista
    private static String nickName = "Buddy";
=======
    private static String barista = "CoffeeBot"; // STUDENT_TODO_1A: Change name
    private static String title = "[Lead Barista]";
>>>>>>> origin/main

    private static int cups = 0;

    public static void brew(String drink) {
<<<<<<< HEAD
        // STUDENT_TODO_2A: Implement - add 1 to cups & print a message
        cups += 1;
        System.out.println("You just brewed cup number "+cups+" of the day.");
        // STUDENT_TODO_2B: Add a second brew-related improvement
=======
        cups++;
        System.out.println("CoffeeBot brewed " + drink + ". Decaf is just a failed build.");
        System.out.println("[BOT CHECK] drink length = " + drink.length());
>>>>>>> origin/main
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}