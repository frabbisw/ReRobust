public void valueChanged(javax.swing.event.ListSelectionEvent arg0) {
    System.out.println("log");
    java.lang.System.out.println(("Test - " + (urlList.getSelectedIndex())));
    setWebsiteDetails(processedWebsites.get(urlList.getSelectedIndex()));
}
