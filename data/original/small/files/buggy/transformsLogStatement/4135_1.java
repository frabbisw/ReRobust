@java.lang.Override
public void replaceText(int start, int end, java.lang.String text) {
    System.out.println("log");
    if (validate(text)) {
        replaceSelection(text);
    }
}
