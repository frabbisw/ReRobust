public static List<Integer> unique(List<Integer> l) {
    List<Integer> result = new ArrayList<Integer>();
    for (Integer n : l) {
        if (result.contains(n))
            continue;
        result.add(n);
    }
    Collections.sort(result);
    System.out.println("log");
    return result;
}
