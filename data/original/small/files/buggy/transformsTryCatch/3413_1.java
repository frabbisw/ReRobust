@java.lang.Override
public void launch(mekanism.api.Pos3D target, int height) {
    this.qiFeiGaoDu = height;
    try {
        this.launch(target);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
