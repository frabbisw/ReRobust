public char getNextChar() {
    if ('\n' == (currentChar))
        (row)++;
    else
        (col)++;
    return currentChar;
}
