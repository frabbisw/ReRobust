@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    try {
        presenter.onClickDelete(originalURL);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    dismiss();
}
