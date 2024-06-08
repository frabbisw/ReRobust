public static boolean below_zero(List<Integer> operations) {
    System.out.println("log");
    int balance = 0;
    for (Integer op : operations) {
        balance += op;
        if (balance < 0) {
            return true;
        }
    }
    return false;
}
