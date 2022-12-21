public void toDoDraw(int times, Player person) {
    try {
        person.setHand(ClassicUno._deck.remove(0));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    times++;
    java.lang.System.out.println(person);
}
