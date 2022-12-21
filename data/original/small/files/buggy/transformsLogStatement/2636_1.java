@java.lang.Override
public void handle(javafx.scene.input.MouseEvent mouseEvent) {
    java.lang.System.out.println("Start!");
    org.procrastinationpatients.tts.core.Engine.getInstance().setProcessor(new org.procrastinationpatients.tts.core.Processor());
    System.out.println("log");
    org.procrastinationpatients.tts.core.Engine.getInstance().getProcessor().start();
    getTimeline().play();
}
