private void result(java.lang.String data) {
    if (!(cb))
        return;
    try {
        cb.success(data);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    cb = null;
}
