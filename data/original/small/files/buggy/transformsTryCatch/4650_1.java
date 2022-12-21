public static void main(java.lang.String[] args) {
    new ui.TwentyOne();
    try {
        ui.TwentyOne.initAdmin();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
