@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.widget.Toast.makeText(getApplicationContext(), "Apagar da base de dados", Toast.LENGTH_SHORT).show();
    System.out.println("log");
    if (deletarCotacaoNaBase()) {
        finish();
    }
}
