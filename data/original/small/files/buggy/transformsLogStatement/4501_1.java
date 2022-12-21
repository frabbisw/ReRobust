private static int choiceValidation(int choice) {
    System.out.println("log");
    if ((choice > 1) || (choice < 4)) {
        return choice;
    } else {
        return 0;
    }
}
