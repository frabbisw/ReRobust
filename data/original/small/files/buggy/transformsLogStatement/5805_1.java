public static void main(java.lang.String[] args) {
    System.out.println("log");
    try {
        new edu.manatriya.banking.ATMMachine().run();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}
