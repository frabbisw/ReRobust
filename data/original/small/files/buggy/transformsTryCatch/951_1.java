@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    try {
        mFile = new java.io.File(getActivity().getExternalFilesDir(null), "pic.jpg");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    edu.ubi.selanjutnya.sharepic.CameraFragment.mDeviceId = Settings.Secure.getString(getContext().getContentResolver(), Settings.Secure.ANDROID_ID);
}
