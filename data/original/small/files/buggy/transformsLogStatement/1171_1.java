@java.lang.Override
public java.lang.Long apply(java.lang.Long input) {
    System.out.println("log");
    if (input < newValue) {
        input = newValue;
        return newValue;
    }
    return input;
}
