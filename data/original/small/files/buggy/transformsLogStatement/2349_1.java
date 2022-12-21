@java.lang.Override
public java.lang.String toString() {
    System.out.println("log");
    switch(this) {
        case CONCERT:
            return "concert";
        default:
            throw new java.lang.IllegalArgumentException();
    }
}
