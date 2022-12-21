public void initializeArray(java.lang.Character[] array) {
    {
        int i = 0;
        while (i < (array.length)) {
            array[i] = new java.lang.Character(randomXCoord(), randomYCoord());
            i++;
        }
    }
}
