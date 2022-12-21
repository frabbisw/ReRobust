public static robokill.GamePanel getGamePanel() {
    System.out.println("log");
    if ((robokill.GamePanel.This) == null) {
        java.lang.System.out.println(0);
        robokill.GamePanel.This = new robokill.GamePanel();
    }
    return robokill.GamePanel.This;
}
