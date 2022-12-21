@java.lang.Override
public void exec(com.ninty.runtime.NiFrame frame) {
    com.ninty.runtime.OperandStack stack = frame.getOperandStack();
    int num1 = stack.popInt();
    int num2 = stack.popInt();
    try {
        stack.pushInt((num1 / num2));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
