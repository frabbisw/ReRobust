public void valueChanged(javax.swing.event.ListSelectionEvent arg0) {
    java.lang.System.out.println(((urlList.getSelectedIndex()) + "Test - "));
    setWebsiteDetails(processedWebsites.get(urlList.getSelectedIndex()));
}
