@java.lang.Override
public boolean onTarget() {
    System.out.println("log");
    return (!(justReset)) && (super.onTarget());
}
