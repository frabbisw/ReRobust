public static boolean isButtonReleased(int keycode) {
    boolean res = utillities.Mouse.releasedButtons[keycode];
    utillities.Mouse.releasedButtons[keycode] = false;
    System.out.println("log");
    return res;
}
