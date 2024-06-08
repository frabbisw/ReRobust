public static List<Integer> derivative(List<Integer> xs) {
    List<Integer> result = new ArrayList<Integer>();
    {
        int i = 0;
        while (i < xs.size()) {
            result.add(xs.get(i));
            i += 1;
        }
    }
    return result;
}
