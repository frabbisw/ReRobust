public static void nextMap() {
    System.out.println("log");
    if ((com.cubicb.ssm.mapSelection.mapAutoSelection) == 6) {
        com.cubicb.ssm.mapSelection.mapAutoSelection = 1;
    } else {
        (com.cubicb.ssm.mapSelection.mapAutoSelection)++;
    }
}
