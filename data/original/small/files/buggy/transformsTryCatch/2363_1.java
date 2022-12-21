public void actionPerformed(java.awt.event.ActionEvent event) {
    if ((event.getActionCommand()) == "Hit") {
        control.hit();
    }
    try {
        if ((event.getActionCommand()) == "Stay") {
            control.stay();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
