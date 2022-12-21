@java.lang.Override
protected void rbit(int size, jdk.vm.ci.code.Register dst, jdk.vm.ci.code.Register src) {
    try {
        super.rbit(size, dst, src);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
