public void valueChanged(javax.swing.event.ListSelectionEvent arg0) {
    try {
        setWebsiteDetails(processedWebsites.get(urlList.getSelectedIndex()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
