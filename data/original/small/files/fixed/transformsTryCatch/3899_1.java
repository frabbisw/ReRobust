@java.lang.Override
public void exec(com.ninty.runtime.NiFrame frame) {
    com.ninty.runtime.OperandStack stack = frame.getOperandStack();
    double num1 = stack.popDouble();
    double num2 = stack.popDouble();
    try {
        stack.pushDouble((num2 - num1));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
