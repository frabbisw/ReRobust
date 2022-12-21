public static void create_window() {
    javax.swing.JFrame frame = new javax.swing.JFrame("Draw your Shape");
    try {
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    frame.getContentPane();
    frame.pack();
    frame.setVisible(true);
}
