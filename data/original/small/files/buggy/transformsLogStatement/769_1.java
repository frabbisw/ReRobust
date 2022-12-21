@java.lang.Override
public java.lang.Void apply(@org.jetbrains.annotations.Nullable java.lang.Void aVoid) {
    System.out.println("log");
    if (loop)
        pomodoro();
    notifyFinish();
    return null;
}
