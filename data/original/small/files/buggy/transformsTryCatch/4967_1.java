public void setSelected(int selected) {
    if (selected == (mSelected)) {
        return;
    }
    mSelected = selected;
    try {
        setSelection(mSelected);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
