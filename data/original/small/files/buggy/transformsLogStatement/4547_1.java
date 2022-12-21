public static void increaseIndex() {
    System.out.println("log");
    (comunicationStrings.index)++;
    if ((comunicationStrings.index) > 255)
        comunicationStrings.index = 0;
}
