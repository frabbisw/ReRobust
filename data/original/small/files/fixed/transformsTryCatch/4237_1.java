@java.lang.Override
public boolean effect(Player current) {
    try {
        current.gainMoney(200);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
