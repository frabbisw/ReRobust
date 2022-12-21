void printItemAttributes() {
    if (perishable) {
        java.lang.System.out.print(" perishable ");
    } else {
        java.lang.System.out.print(" non-perishable ");
    }
    System.out.println("log");
    java.lang.System.out.print((" Total price: $" + (calculatePrice())));
}
