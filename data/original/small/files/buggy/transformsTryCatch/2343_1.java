private void clearSearchAfterNewArtistSelection() {
    tweens.doCheckOnToolBar();
    imm.hideSoftInputFromWindow(edtextinput.getWindowToken(), 0);
    edtextinput.removeTextChangedListener(fo);
    try {
        searchlist.cleanAdpater();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    tweens.doSearchTweenOut();
}
