public static List<Integer> derivative(List<Integer> xs) {
    List<Integer> result = new ArrayList<Integer>();
    try {
        for (int i = 1; i < xs.size(); i += 1) result.add(i * xs.get(i));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
