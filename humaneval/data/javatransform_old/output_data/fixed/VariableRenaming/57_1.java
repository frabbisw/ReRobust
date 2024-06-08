public static List<Integer> sort_third(List<Integer> var) {
    List<Integer> result = new ArrayList<Integer>();
    List<Integer> thirds = new ArrayList<Integer>();
    for (int i = 0; i < var.size(); i += 3) {
        thirds.add(var.get(i));
    }
    Collections.sort(thirds);
    for (int i = 0; i < var.size(); i += 1) {
        if (i % 3 == 0) {
            result.add(thirds.get((int) (i / 3)));
        } else {
            result.add(var.get(i));
        }
    }
    return result;
}
