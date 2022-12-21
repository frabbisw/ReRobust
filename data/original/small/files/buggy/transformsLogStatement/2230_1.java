@java.lang.Override
public java.lang.String get() {
    System.out.println("log");
    java.lang.String result = getNumbers(context).get(0);
    setNumber(result);
    return result;
}
