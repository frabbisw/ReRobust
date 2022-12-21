@java.lang.Override
public void push(int i) {
    try {
        this.memory.add(this.memory.size(), i);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
