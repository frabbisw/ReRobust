@java.lang.Override
public void onSettingsChanged() {
    volume = ((com.retroMachines.RetroMachines) (Gdx.app.getApplicationListener())).getSettingController().getVolume();
    try {
        if ((music) != null) {
            music.setVolume(volume);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
