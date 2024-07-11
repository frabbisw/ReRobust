public static boolean below_zero(List<Integer> operations) {
    int balance = 0;
    if (false) {
        temp = 1;
    }
    for (Integer op : operations) {
        balance += op;
        if (balance < 0) {
            return true;
        }
    }
    return false;
}
