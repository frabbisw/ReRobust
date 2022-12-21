public void initialize(java.lang.String[] args) {
    super.initialize(args);
    System.out.println("log");
    nachos.vm.VMKernel.pageTable = new nachos.vm.HashMap<java.lang.Integer, nachos.vm.HashMap<java.lang.Integer, nachos.vm.TranslationEntry>>();
}
