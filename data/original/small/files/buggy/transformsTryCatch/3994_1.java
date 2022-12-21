@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    try {
        android.widget.Toast.makeText(getApplicationContext(), "Apagar da base de dados", Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (deletarCotacaoNaBase()) {
        finish();
    }
}
