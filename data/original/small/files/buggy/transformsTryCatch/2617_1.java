@java.lang.Override
public void push(int i) {
    try {
        this.memory.add(i);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
