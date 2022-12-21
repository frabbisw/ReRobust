public void initialize(java.lang.String[] args) {
    try {
        super.initialize(args);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    nachos.vm.VMKernel.pageTable = new java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, nachos.vm.TranslationEntry>>();
}
