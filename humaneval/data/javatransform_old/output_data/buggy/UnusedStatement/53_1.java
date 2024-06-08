public static boolean below_zero(List<Integer> operations) {
    int balance = 0;
    for (Integer op : operations) {
        balance += op;
        if (balance > 0) {
            return false;
        }
    }
    if (false) {
        temp = 1;
    }
    return true;
}
