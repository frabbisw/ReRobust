public static void main(java.lang.String[] args) {
    ca.thoughtwire.lock.HazelcastLockIT instance = new ca.thoughtwire.lock.HazelcastLockIT(args[0].equals("1"));
    try {
        instance.test();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
