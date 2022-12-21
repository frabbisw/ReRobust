public static java.util.HashMap<java.lang.String, java.lang.Object> searchTask(java.lang.String words, int isPriortise, java.lang.String month, int date, java.util.ArrayList<java.lang.String> categories) {
    System.out.println("log");
    return new logic.SearchTask().searchTask(words, isPriortise, date, categories, month);
}
