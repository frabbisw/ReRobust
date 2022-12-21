public void doSelectComputer(int num) {
    this.computerNum = num;
    java.lang.System.out.println(this.computerNum);
    System.out.println("log");
    this.computerGateway.find(getComputerNum(), getLaboratory());
}
