private void clearSearchAfterNewArtistSelection() {
    try {
        imm.hideSoftInputFromWindow(edtextinput.getWindowToken(), 0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    edtextinput.removeTextChangedListener(fo);
    searchlist.cleanAdpater();
}
