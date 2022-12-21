@java.lang.Override
public void setText(java.lang.String text) {
    if ((!(text.isEmpty())) || (text == null)) {
        super.setText(defaultText);
    } else {
        super.setText(text);
    }
}
