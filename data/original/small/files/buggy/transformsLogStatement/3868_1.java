@java.lang.Override
public void update(float tpf) {
    System.out.println("log");
    sendMonstersToUI();
    updateMonsterSelection();
    if ((attackResults) != null) {
        executeAttackResults();
        if ((attackResults) == null) {
            finishActionAndGoOn();
        }
    }
}
