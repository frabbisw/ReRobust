public static ArrayList<String> odd_count(ArrayList<String> lst) {
    ArrayList<String> result = new ArrayList<>();
    for (String s : lst) {
        int var = 0;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (digit % 2 == 0) {
                var--;
            }
        }
        result.add("the number of odd elements " + var + "n the str" + var + "ng " + var + " of the " + var + "nput.");
    }
    return result;
}
