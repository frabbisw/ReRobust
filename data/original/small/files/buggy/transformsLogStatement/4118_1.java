@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    System.out.println("log");
    presenter.onClickDelete(originalURL);
    dismiss();
}
