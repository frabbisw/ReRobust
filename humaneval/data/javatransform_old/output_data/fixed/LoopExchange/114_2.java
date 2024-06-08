public static boolean pairs_sum_to_zero(List<Integer> l) {
    for (int i = 0; i < l.size(); i += 1) {
        {
            int j = i + 1;
            while (j < l.size()) {
                if (l.get(i) + l.get(j) == 0)
                    return true;
                j += 1;
            }
        }
    }
    return false;
}
