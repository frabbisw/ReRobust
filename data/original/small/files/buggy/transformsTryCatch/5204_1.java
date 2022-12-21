public void UnLoadMod() {
    try {
        synchronized (com.peculiargames.andmodplug.PlayerThread.sRDlock) {
            com.peculiargames.andmodplug.PlayerThread.ModPlug_JUnload();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
