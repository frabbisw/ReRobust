@java.lang.Override
public java.lang.Long apply(java.lang.Long input) {
    if (newValue > input) {
        input = newValue;
        return newValue;
    }
    return input;
}
