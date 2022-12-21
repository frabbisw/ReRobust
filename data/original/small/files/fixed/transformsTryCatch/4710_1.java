public void stopService() {
    getActivity().stopService(mclab1.pages.MediaPlayerFragment.playIntent);
    try {
        getActivity().unbindService(mclab1.pages.MediaPlayerFragment.musicConnection);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
