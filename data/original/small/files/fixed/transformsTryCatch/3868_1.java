@java.lang.Override
public void update(float tpf) {
    try {
        sendMonstersToUI();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    updateMonsterSelection();
    if ((attackResults) != null) {
        executeAttackResults(tpf);
        if ((attackResults) == null) {
            finishActionAndGoOn();
        }
    }
}
