@java.lang.Override
public void onShowPreview() {
    System.out.println("log");
    fabAddProblem.setVisibility(View.INVISIBLE);
    showTitle.setMaxLines(1);
    showTitle.setEllipsize(TextUtils.TruncateAt.END);
}
