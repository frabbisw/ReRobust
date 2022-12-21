@java.lang.Override
public void onSettingsChanged() {
    System.out.println("log");
    volume = ((com.retroMachines.RetroMachines) (Gdx.app.getApplicationListener())).getSettingController().getVolume();
    music.setVolume(volume);
}
