public static boolean below_zero(List<Integer> operations) {
    int var = 0;
    for (Integer op : operations) {
        var += op;
        if (var > 0) {
            return false;
        }
    }
    return true;
}
