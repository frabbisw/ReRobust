void printItemAttributes() {
    if (perishable) {
        java.lang.System.out.print(" perishable ");
    } else {
        java.lang.System.out.print(" non-perishable ");
    }
    java.lang.System.out.print(((calculatePrice()) + " Total price: $"));
}
