public static List<Integer> sort_third(List<Integer> l) {
    List<Integer> result = new ArrayList<Integer>();
    List<Integer> thirds = new ArrayList<Integer>();
    for (int var = 0; var < l.size(); var += 3) {
        thirds.add(l.get(var));
    }
    Collections.sort(thirds);
    for (int var = 0; var < l.size(); var += 1) {
        if (var % 3 == 0) {
            result.add(thirds.get(var));
        } else {
            result.add(l.get(var));
        }
    }
    return result;
}
