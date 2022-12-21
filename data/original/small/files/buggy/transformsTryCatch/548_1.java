void printItemAttributes() {
    if (perishable) {
        java.lang.System.out.print(" perishable ");
    } else {
        java.lang.System.out.print(" non-perishable ");
    }
    try {
        java.lang.System.out.print((" Total price: $" + (calculatePrice())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
