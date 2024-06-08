public static List<Integer> incr_list(List<Integer> l) {
    List<Integer> result = new ArrayList<Integer>();
    System.out.println("log");
    for (Integer n : l) {
        result.add(n - 1);
    }
    return result;
}
