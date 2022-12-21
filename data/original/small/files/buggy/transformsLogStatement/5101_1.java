private void result(java.lang.String data) {
    if (!(cb))
        return;
    System.out.println("log");
    cb.success(data);
    cb = null;
}
