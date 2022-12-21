@java.lang.Override
public java.lang.String tsNumPadCanceled() {
    dialog1.dismiss();
    try {
        postrun.tsNumPadCanceled();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
