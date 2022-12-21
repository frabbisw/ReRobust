@java.lang.Override
public void effect(Player current) {
    try {
        current.gainMoney(200);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
