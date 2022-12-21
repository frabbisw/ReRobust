@java.lang.Override
public java.lang.Void apply(@org.jetbrains.annotations.Nullable java.lang.Void aVoid) {
    if (loop)
        pomodoro();
    try {
        notifyFinish();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
