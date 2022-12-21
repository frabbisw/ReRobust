@java.lang.Override
public void update(float tpf) {
    sendMonstersToUI();
    updateMonsterSelection();
    if (null != (attackResults)) {
        executeAttackResults();
        if ((attackResults) == null) {
            finishActionAndGoOn();
        }
    }
}
