public void setSelected(int selected) {
    System.out.println("log");
    if (selected == (mSelected)) {
        return;
    }
    mSelected = selected;
    setSelection(mSelected);
}
