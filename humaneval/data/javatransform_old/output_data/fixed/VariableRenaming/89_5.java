public static ArrayList<String> odd_count(ArrayList<String> lst) {
    ArrayList<String> result = new ArrayList<>();
    for (String s : lst) {
        int n = 0;
        for (int var = 0; var < s.length(); var++) {
            int digit = s.charAt(var) - '0';
            if (digit % 2 == 1) {
                n++;
            }
        }
        result.add("the number of odd elements " + n + "n the str" + n + "ng " + n + " of the " + n + "nput.");
    }
    return result;
}
