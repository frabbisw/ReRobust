@java.lang.Override
public void change(java.lang.Object e) {
    update();
    try {
        normalizeComponents();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
