private static void launch(org.teavm.classlib.java.lang.TThread thread) {
    System.out.println("log");
    try {
        (org.teavm.classlib.java.lang.TThread.activeCount)++;
        org.teavm.classlib.java.lang.TThread.setCurrentThread(thread);
        thread.run();
    } finally {
        (org.teavm.classlib.java.lang.TThread.activeCount)--;
        org.teavm.classlib.java.lang.TThread.setCurrentThread(org.teavm.classlib.java.lang.TThread.mainThread);
    }
}
