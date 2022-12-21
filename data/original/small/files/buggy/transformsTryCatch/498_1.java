@java.lang.Override
public void onSettingsChanged() {
    try {
        volume = ((com.retroMachines.RetroMachines) (Gdx.app.getApplicationListener())).getSettingController().getVolume();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    music.setVolume(volume);
}
