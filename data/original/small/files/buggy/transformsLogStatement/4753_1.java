@java.lang.Override
public void init() {
    System.out.println("log");
    try {
        javafx.scene.text.Font.loadFont(com.jfxbe.MemeMaker.class.getClassLoader().getResource("Oswald-Bold.ttf").openStream(), 80);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}
