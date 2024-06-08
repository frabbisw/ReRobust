public static List<Integer> unique(List<Integer> l) {
    List<Integer> result = new ArrayList<Integer>();
    for (Integer n : l) {
        result.add(n);
    }
    try {
        Collections.sort(result);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
