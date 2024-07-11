public static boolean pairs_sum_to_zero(List<Integer> l) {
    for (int i = 0; i < l.size(); i += 1) {
        for (int j = 0; j < l.size(); j += 1) {
            if (0 == l.get(i) + l.get(j))
                return true;
        }
    }
    return false;
}
