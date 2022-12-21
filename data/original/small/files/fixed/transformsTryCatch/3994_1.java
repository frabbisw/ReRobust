@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    try {
        if (deletarCotacaoNaBase()) {
            finish();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
