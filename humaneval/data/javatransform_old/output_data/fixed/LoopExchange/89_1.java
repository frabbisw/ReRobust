public static ArrayList<String> odd_count(ArrayList<String> lst) {
    ArrayList<String> result = new ArrayList<>();
    for (String s : lst) {
        int n = 0;
        {
            int i = 0;
            while (i < s.length()) {
                int digit = s.charAt(i) - '0';
                if (digit % 2 == 1) {
                    n++;
                }
                i++;
            }
        }
        result.add("the number of odd elements " + n + "n the str" + n + "ng " + n + " of the " + n + "nput.");
    }
    return result;
}
