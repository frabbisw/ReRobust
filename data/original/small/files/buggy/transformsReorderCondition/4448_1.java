private void comboSortActionPerformed(java.awt.event.ActionEvent evt) {
    java.lang.String kategori = ((java.lang.String) (comboSort.getSelectedItem()));
    if ("Semua Data" == kategori) {
        getAllData();
    } else {
        getSelectedData(kategori);
    }
}
