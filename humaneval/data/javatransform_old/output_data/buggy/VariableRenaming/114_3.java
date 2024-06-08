public static boolean pairs_sum_to_zero(List<Integer> l) {
    for (int i = 0; i < l.size(); i += 1) {
        for (int var = 0; var < l.size(); var += 1) {
            if (l.get(i) + l.get(var) == 0)
                return true;
        }
    }
    return false;
}
