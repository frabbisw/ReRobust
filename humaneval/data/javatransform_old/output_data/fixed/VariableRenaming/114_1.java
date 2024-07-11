public static boolean pairs_sum_to_zero(List<Integer> var) {
    for (int i = 0; i < var.size(); i += 1) {
        for (int j = i + 1; j < var.size(); j += 1) {
            if (var.get(i) + var.get(j) == 0)
                return true;
        }
    }
    return false;
}
