public static void displayMenu() {
    java.lang.System.out.println("0 - Exit");
    java.lang.System.out.println("1 - View All Movies ");
    java.lang.System.out.println("2 - View Animated Movies");
    java.lang.System.out.println("3 - View Drama Category");
    java.lang.System.out.println("4 - View Horror Category");
    try {
        java.lang.System.out.println("5 - View Sci-Fi Category");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println("Please enter a number: ");
    Java2.MoviesApplication.input.nextLine();
}
