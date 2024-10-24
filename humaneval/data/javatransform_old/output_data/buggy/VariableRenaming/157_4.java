public static ArrayList<String> by_length(ArrayList<Integer> a) {
    Map<Integer, String> digit_map = new HashMap<>();
    digit_map.put(1, "One");
    digit_map.put(2, "Two");
    digit_map.put(3, "Three");
    digit_map.put(4, "Four");
    digit_map.put(5, "Five");
    digit_map.put(6, "Six");
    digit_map.put(7, "Seven");
    digit_map.put(8, "Eight");
    digit_map.put(9, "Nine");
    Collections.sort(a, Collections.reverseOrder());
    ArrayList<String> result = new ArrayList<>();
    for (int var : a) {
        if (digit_map.get(var) != "") {
            result.add(digit_map.get(var));
        }
    }
    return result;
}