@java.lang.Override
public void launch(mekanism.api.Pos3D target, int height) {
    qiFeiGaoDu = height;
    try {
        launch(target);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
