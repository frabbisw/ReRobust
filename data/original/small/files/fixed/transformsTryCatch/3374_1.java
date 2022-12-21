@java.lang.Override
public void handle(java.util.Map data) {
    dbf.remove(self);
    try {
        returnVip();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    completion.success();
}
