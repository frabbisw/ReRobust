public static boolean below_zero(List<Integer> operations) {
    int balance = 0;
    for (Integer op : operations) {
        balance += op;
        if (0 < balance) {
            return false;
        }
    }
    return true;
}
