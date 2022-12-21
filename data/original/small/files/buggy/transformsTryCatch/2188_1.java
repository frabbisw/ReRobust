@java.lang.Override
public java.lang.Void caseInstStore(com.synflow.models.ir.InstStore store) {
    try {
        if (store.getIndexes().isEmpty()) {
            stored.add(store.getTarget().getVariable());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return com.synflow.models.util.SwitchUtil.DONE;
}
