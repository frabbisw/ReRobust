public void run() {
    try {
        main.Driver.prepareGUI();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    main.Driver.startCheck();
}
