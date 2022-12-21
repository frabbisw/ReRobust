public void UnLoadMod() {
    System.out.println("log");
    synchronized (com.peculiargames.andmodplug.PlayerThread.sRDlock) {
        com.peculiargames.andmodplug.PlayerThread.ModPlug_JUnload();
    }
}
