public java.lang.String promptControl() {
    java.lang.String ctrl = "";
    try {
        java.lang.System.out.print("Enter a control: ");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    ctrl = Keyboard.readString();
    return ctrl;
}
