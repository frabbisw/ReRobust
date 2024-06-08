public static String sort_numbers(String numbers) {
    final HashMap<String, Integer> var = new HashMap<String, Integer>();
    var.put("zero", 0);
    var.put("one", 1);
    var.put("two", 2);
    var.put("three", 3);
    var.put("four", 4);
    var.put("five", 5);
    var.put("six", 6);
    var.put("seven", 7);
    var.put("eight", 8);
    var.put("nine", 9);
    ArrayList<String> number_array = new ArrayList<String>(Arrays.asList(numbers.split(" ")));
    Collections.sort(number_array, new Comparator<String>() {

        public int compare(String n1, String n2) {
            return var.get(n1) - var.get(n2);
        }
    });
    String result = "";
    for (String number : number_array) {
        result += number + " ";
    }
    return result.trim();
}
