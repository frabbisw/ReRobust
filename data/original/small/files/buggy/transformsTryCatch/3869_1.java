public static void create_window() {
    javax.swing.JFrame frame = new javax.swing.JFrame("Draw your Shape");
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    try {
        frame.getContentPane().frame.pack();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    frame.setVisible(true);
}
