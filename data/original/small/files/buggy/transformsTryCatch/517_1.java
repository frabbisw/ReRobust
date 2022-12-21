@java.lang.Override
public void run() {
    try {
        stg.getPannelloDado().animazione(java.lang.Integer.parseInt(r[1]));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
