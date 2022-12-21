@java.lang.Override
public boolean isValid(java.lang.CharSequence value) {
    return ((value.length()) >= (minLength)) && (android.text.TextUtils.isEmpty(value));
}
