@java.lang.Override
public void replaceText(int start, int end, java.lang.String text) {
    try {
        if (validate(text)) {
            super.replaceText(start, end, text);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
