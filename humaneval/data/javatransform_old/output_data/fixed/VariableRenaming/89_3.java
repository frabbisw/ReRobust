public static ArrayList<String> odd_count(ArrayList<String> lst) {
    ArrayList<String> result = new ArrayList<>();
    for (String var : lst) {
        int n = 0;
        for (int i = 0; i < var.length(); i++) {
            int digit = var.charAt(i) - '0';
            if (digit % 2 == 1) {
                n++;
            }
        }
        result.add("the number of odd elements " + n + "n the str" + n + "ng " + n + " of the " + n + "nput.");
    }
    return result;
}
