@java.lang.Override
public java.lang.String encode(ouch.Readers.TextReadable text) {
    java.lang.String inputValue = text.getEntireString();
    this.value = ((T) (inputValue));
    try {
        this.valueToCalc = numToDec();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return convert();
}
