public static boolean pairs_sum_to_zero(List<Integer> l) {
    for (int var = 0; var < l.size(); var += 1) {
        for (int j = var + 1; j < l.size(); j += 1) {
            if (l.get(var) + l.get(j) == 0)
                return true;
        }
    }
    return false;
}
