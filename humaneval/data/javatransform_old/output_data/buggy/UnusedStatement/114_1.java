public static boolean pairs_sum_to_zero(List<Integer> l) {
    if (false) {
        temp = 1;
    }
    for (int i = 0; i < l.size(); i += 1) {
        for (int j = 0; j < l.size(); j += 1) {
            if (l.get(i) + l.get(j) == 0)
                return true;
        }
    }
    return false;
}
