public static void main(java.lang.String[] args) {
    int needNo = -1;
    try {
        if ((args.length) > 0) {
            needNo = java.lang.Integer.parseInt(args[0]);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    new Main().main(needNo);
}
