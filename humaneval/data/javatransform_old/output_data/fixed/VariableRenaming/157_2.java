public static ArrayList<String> by_length(ArrayList<Integer> a) {
    Map<Integer, String> var = new HashMap<>();
    var.put(1, "One");
    var.put(2, "Two");
    var.put(3, "Three");
    var.put(4, "Four");
    var.put(5, "Five");
    var.put(6, "Six");
    var.put(7, "Seven");
    var.put(8, "Eight");
    var.put(9, "Nine");
    Collections.sort(a, Collections.reverseOrder());
    ArrayList<String> result = new ArrayList<>();
    for (int num : a) {
        if (var.get(num) != null) {
            result.add(var.get(num));
        }
    }
    return result;
}
