public void initialize(java.lang.String[] args) {
    try {
        super.initialize(args);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    nachos.vm.VMKernel.pageTable = new nachos.vm.HashMap<java.lang.Integer, nachos.vm.HashMap<java.lang.Integer, nachos.vm.TranslationEntry>>();
}
