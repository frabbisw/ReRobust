@java.lang.Override
public void onClick(android.view.View v) {
    try {
        android.widget.Toast.makeText(this, "Presionó botón Creditos", Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    olimpiadas.sena.com.olimpiadasmath.util.DialogHelper.showCopyRightDialog(v.getContext());
}
