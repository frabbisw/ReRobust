@java.lang.Override
public void onShowPreview() {
    showTitle.setMaxLines(1);
    try {
        showTitle.setEllipsize(TextUtils.TruncateAt.END);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
