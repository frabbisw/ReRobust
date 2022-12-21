public void toDoDraw(Player person) {
    try {
        person.setHand(ClassicUno._deck.remove(0));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println(person);
}
