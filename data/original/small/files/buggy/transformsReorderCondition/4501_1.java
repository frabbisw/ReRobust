private static int choiceValidation(int choice) {
    if ((choice < 4) || (choice > 1)) {
        return choice;
    } else {
        return 0;
    }
}
