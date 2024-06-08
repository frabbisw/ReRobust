public static boolean pairs_sum_to_zero(List<Integer> l) {
    try {
        for (int i = 0; i < l.size(); i += 1) {
            for (int j = i + 1; j < l.size(); j += 1) {
                if (l.get(i) + l.get(j) == 0)
                    return true;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
