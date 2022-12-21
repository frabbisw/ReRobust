public void doSelectComputer(int num) {
    this.computerNum = num;
    try {
        java.lang.System.out.println(this.computerNum);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.computerGateway.find(getComputerNum(), getLaboratory());
}
