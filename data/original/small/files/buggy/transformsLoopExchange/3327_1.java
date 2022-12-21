private void initializeArrayList(int length) {
    passwordArray = new char[length];
    {
        int i = 0;
        while (i < length) {
            passwordArray[i] = ' ';
            i++;
        }
    }
}
