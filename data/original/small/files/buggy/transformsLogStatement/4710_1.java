public void stopService() {
    System.out.println("log");
    getActivity().unbindService(mclab1.pages.MediaPlayerFragment.musicConnection);
    getActivity().stopService(mclab1.pages.MediaPlayerFragment.playIntent);
}
