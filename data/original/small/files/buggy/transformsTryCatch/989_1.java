@java.lang.Override
public void onClick(android.view.View v) {
    try {
        bankerSelect(3);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    bankerSelectNotify.dismiss();
}
