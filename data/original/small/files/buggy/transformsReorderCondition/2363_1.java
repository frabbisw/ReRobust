public void actionPerformed(java.awt.event.ActionEvent event) {
    if ("Hit" == (event.getActionCommand())) {
        control.hit();
    }
    if ((event.getActionCommand()) == "Stay") {
        control.stay();
    }
}
