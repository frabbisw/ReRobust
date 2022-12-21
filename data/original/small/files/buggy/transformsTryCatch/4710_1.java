public void stopService() {
    getActivity().unbindService(mclab1.pages.MediaPlayerFragment.musicConnection);
    try {
        getActivity().stopService(mclab1.pages.MediaPlayerFragment.playIntent);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
