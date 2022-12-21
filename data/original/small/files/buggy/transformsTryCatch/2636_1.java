@java.lang.Override
public void handle(javafx.scene.input.MouseEvent mouseEvent) {
    try {
        java.lang.System.out.println("Start!");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.procrastinationpatients.tts.core.Engine.getInstance().setProcessor(new org.procrastinationpatients.tts.core.Processor());
    org.procrastinationpatients.tts.core.Engine.getInstance().getProcessor().start();
    getTimeline().play();
}
