@java.lang.Override
public boolean isValid(java.lang.CharSequence value) {
    System.out.println("log");
    return (android.text.TextUtils.isEmpty(value)) && ((value.length()) >= (minLength));
}
