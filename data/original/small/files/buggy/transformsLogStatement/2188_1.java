@java.lang.Override
public java.lang.Void caseInstStore(com.synflow.models.ir.InstStore store) {
    System.out.println("log");
    if (store.getIndexes().isEmpty()) {
        stored.add(store.getTarget().getVariable());
    }
    return com.synflow.models.util.SwitchUtil.DONE;
}
