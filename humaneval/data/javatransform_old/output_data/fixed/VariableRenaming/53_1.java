public static boolean below_zero(List<Integer> var) {
    int balance = 0;
    for (Integer op : var) {
        balance += op;
        if (balance < 0) {
            return true;
        }
    }
    return false;
}
