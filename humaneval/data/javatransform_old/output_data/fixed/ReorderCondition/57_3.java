public static List<Integer> sort_third(List<Integer> l) {
    List<Integer> result = new ArrayList<Integer>();
    List<Integer> thirds = new ArrayList<Integer>();
    for (int i = 0; i < l.size(); i += 3) {
        thirds.add(l.get(i));
    }
    Collections.sort(thirds);
    for (int i = 0; i < l.size(); i += 1) {
        if (0 == i % 3) {
            result.add(thirds.get((int) (i / 3)));
        } else {
            result.add(l.get(i));
        }
    }
    return result;
}
