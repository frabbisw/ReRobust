private void comboSortActionPerformed(java.awt.event.ActionEvent evt) {
    java.lang.String kategori = ((java.lang.String) (comboSort.getSelectedItem()));
    try {
        if (kategori == "Semua Data") {
            getAllData();
        } else {
            getSelectedData(kategori);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
