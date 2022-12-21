@java.lang.Override
public void onClick(android.view.View v) {
    try {
        olimpiadas.sena.com.olimpiadasmath.util.DialogHelper.showCopyRightDialog(v.getContext());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
