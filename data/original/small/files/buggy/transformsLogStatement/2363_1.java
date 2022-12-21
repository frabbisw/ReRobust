public void actionPerformed(java.awt.event.ActionEvent event) {
    if ((event.getActionCommand()) == "Hit") {
        control.hit();
    }
    System.out.println("log");
    if ((event.getActionCommand()) == "Stay") {
        control.stay();
    }
}
