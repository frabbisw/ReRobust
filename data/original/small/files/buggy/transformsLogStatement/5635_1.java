public static void main(java.lang.String[] args) {
    int needNo = -1;
    System.out.println("log");
    if ((args.length) > 0) {
        needNo = java.lang.Integer.parseInt(args[0]);
    }
    new Main().main(needNo);
}
