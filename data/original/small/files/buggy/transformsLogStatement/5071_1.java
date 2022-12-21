public void initializeArray(java.lang.Character[] array) {
    System.out.println("log");
    for (int i = 0; i < (array.length); i++) {
        array[i] = new java.lang.Character(randomXCoord(), randomYCoord());
    }
}
