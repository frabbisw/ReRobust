@java.lang.Override
public boolean commitText(java.lang.CharSequence text, int newCursorPosition) {
    final boolean result = super.commitText(text, newCursorPosition);
    try {
        updateEditingState();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
