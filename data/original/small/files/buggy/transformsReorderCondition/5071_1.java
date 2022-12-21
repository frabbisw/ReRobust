public void initializeArray(java.lang.Character[] array) {
    for (int i = 0; (array.length) > i; i++) {
        array[i] = new java.lang.Character(randomXCoord(), randomYCoord());
    }
}
