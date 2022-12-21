@java.lang.Override
public java.lang.String encode(ouch.Readers.TextReadable text) {
    java.lang.String inputValue = text.getEntireString();
    this.value = inputValue.toUpperCase();
    try {
        this.valueToCalc = numToDec();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return convert();
}
