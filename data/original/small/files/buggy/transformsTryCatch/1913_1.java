public void run() {
    main.Driver d = new main.Driver();
    try {
        d.prepareGUI();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    d.startCheck();
}
