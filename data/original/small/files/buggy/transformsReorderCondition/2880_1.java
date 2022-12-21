public static void main(java.lang.String[] args) {
    if (1 == (args.length)) {
        java.lang.System.out.printf("Hello there!\n");
    } else {
        java.lang.System.out.printf("Hello there, %s!\n", args[((args.length) - 1)]);
    }
}
