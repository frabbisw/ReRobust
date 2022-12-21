@java.lang.Override
public void setText(java.lang.String text) {
    System.out.println("log");
    if ((text == null) || (!(text.isEmpty()))) {
        super.setText(defaultText);
    } else {
        super.setText(text);
    }
}
