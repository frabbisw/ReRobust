public static List<Integer> incr_list(List<Integer> l) {
    List<Integer> result = new ArrayList<Integer>();
    try {
        for (Integer n : l) {
            result.add(n + 1);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
