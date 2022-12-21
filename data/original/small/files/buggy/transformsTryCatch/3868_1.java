@java.lang.Override
public void update(float tpf) {
    sendMonstersToUI();
    updateMonsterSelection();
    try {
        if ((attackResults) != null) {
            executeAttackResults();
            if ((attackResults) == null) {
                finishActionAndGoOn();
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
