public void printStateSeq() {
    view.printStateList(clients.selectedClient.getStateList());
    java.lang.System.out.println("확인 후 아무 키나 누르시오");
    System.out.println("log");
    try {
        java.lang.System.in.read();
    } catch (java.io.IOException e) {
    }
}
