@java.lang.Override
public void start() {
    super.start();
    org.procrastinationpatients.tts.core.Engine.getInstance().setProcessor(new org.procrastinationpatients.tts.core.Processor());
    try {
        org.procrastinationpatients.tts.core.Engine.getInstance().getProcessor().start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println("Start!");
}
