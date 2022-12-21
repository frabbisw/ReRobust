public void actionPerformed(java.awt.event.ActionEvent event) {
    if ((event.getActionCommand()) == "Hit") {
        java.lang.System.out.println("Hit");
    }
    try {
        if ((event.getActionCommand()) == "Stay") {
            java.lang.System.out.println("Stay");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
