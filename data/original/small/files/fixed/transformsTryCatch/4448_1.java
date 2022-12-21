private void comboSortActionPerformed(java.awt.event.ActionEvent evt) {
    java.lang.String kategori = ((java.lang.String) (comboSort.getSelectedItem()));
    try {
        if ("Semua Data".equals(kategori)) {
            getAllData();
        } else {
            getSelectedData(kategori);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
