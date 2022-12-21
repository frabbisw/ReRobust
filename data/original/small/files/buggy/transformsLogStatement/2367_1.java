private static long apply(long permission, long allow, long deny) {
    System.out.println("log");
    deny &= ~allow;
    permission |= allow;
    permission &= ~deny;
    return permission;
}
