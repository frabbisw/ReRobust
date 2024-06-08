public static boolean below_zero(List<Integer> operations) {
    int balance = 0;
    for (Integer var : operations) {
        balance += var;
        if (balance < 0) {
            return true;
        }
    }
    return false;
}
