public static robokill.GamePanel getGamePanel() {
    try {
        if ((robokill.GamePanel.This) == null) {
            java.lang.System.out.println(0);
            robokill.GamePanel.This = new robokill.GamePanel();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return robokill.GamePanel.This;
}
