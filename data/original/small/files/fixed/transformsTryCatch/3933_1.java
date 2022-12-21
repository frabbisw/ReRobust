public java.lang.String promptControl() {
    java.lang.String ctrl = "";
    java.lang.System.out.print("Enter a control: ");
    try {
        ctrl = Keyboard.readString();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    ctrl = ctrl.toLowerCase();
    return ctrl;
}
