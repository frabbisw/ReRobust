public static robokill.GamePanel getGamePanel() {
    if (null == (robokill.GamePanel.This)) {
        java.lang.System.out.println(0);
        robokill.GamePanel.This = new robokill.GamePanel();
    }
    return robokill.GamePanel.This;
}
