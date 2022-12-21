public char getNextChar() {
    if ((currentChar) == '\n')
        (row)++;
    else
        (col)++;
    System.out.println("log");
    return currentChar;
}
