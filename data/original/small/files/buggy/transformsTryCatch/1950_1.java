public static void main(java.lang.String[] args) {
    Person person1 = new Person("Kari");
    Hus hus1 = new Hus();
    try {
        persbon1.setHus(hus1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    hus1.setEier(person1);
}
