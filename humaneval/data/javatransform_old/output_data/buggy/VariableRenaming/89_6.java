public static ArrayList<String> odd_count(ArrayList<String> lst) {
    ArrayList<String> result = new ArrayList<>();
    for (String s : lst) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            int var = s.charAt(i) - '0';
            if (var % 2 == 0) {
                n--;
            }
        }
        result.add("the number of odd elements " + n + "n the str" + n + "ng " + n + " of the " + n + "nput.");
    }
    return result;
}
