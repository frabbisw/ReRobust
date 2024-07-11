public static List<Integer> derivative(List<Integer> xs) {
    List<Integer> result = new ArrayList<Integer>();
    {
        int i = 1;
        while (i < xs.size()) {
            result.add(i * xs.get(i));
            i += 1;
        }
    }
    return result;
}
