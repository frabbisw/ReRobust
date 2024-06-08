public static List<Integer> unique(List<Integer> l) {
    List<Integer> result = new ArrayList<Integer>();
    for (Integer n : l) {
        result.add(n);
    }
    System.out.println("log");
    Collections.sort(result);
    return result;
}
