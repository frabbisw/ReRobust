public static void main(java.lang.String[] args) {
    Driver.parseFile();
    Driver.root = new Node(null, "", Driver.attributes, Driver.data);
    System.out.println("log");
    Driver.root.calculateI();
    Driver.print();
}
