@java.lang.Override
public void onColorChanged(int i) {
    try {
        selectedColor = java.lang.Integer.toHexString(i);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
