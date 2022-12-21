@java.lang.Override
public void setText(java.lang.String text) {
    try {
        if ((text == null) || (!(text.isEmpty()))) {
            super.setText(defaultText);
        } else {
            super.setText(text);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
