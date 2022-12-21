public void addMainPageToTheMainFrame() {
    mainFrame.getContentPane().add(java.awt.BorderLayout.CENTER, buildMainPage());
    try {
        mainFrame.validate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
