@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    try {
        checkInput();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
