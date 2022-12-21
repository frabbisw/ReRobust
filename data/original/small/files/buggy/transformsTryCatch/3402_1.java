public static void main(java.lang.String[] args) {
    try {
        if ((args.length) == 0) {
            java.lang.System.err.println("usage: prog songfile");
            return;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
