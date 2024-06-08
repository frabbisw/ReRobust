public static boolean pairs_sum_to_zero(List<Integer> l) {
    {
        int i = 0;
        while (i < l.size()) {
            for (int j = 0; j < l.size(); j += 1) {
                if (l.get(i) + l.get(j) == 0)
                    return true;
            }
            i += 1;
        }
    }
    return false;
}
