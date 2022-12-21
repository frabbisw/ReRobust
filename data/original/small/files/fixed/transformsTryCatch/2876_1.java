public void doSelectComputer(int num) {
    this.computerNum = num;
    try {
        this.computerGateway.find(getComputerNum(), getLaboratory());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
