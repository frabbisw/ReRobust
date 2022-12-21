@java.lang.Override
public void handle(java.util.Map data) {
    try {
        returnVip();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    dbf.remove(self);
    completion.success();
}
