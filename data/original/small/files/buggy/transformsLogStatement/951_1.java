@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    System.out.println("log");
    super.onActivityCreated(savedInstanceState);
    mFile = new java.io.File(getActivity().getExternalFilesDir(null), "pic.jpg");
    edu.ubi.selanjutnya.sharepic.CameraFragment.mDeviceId = Settings.Secure.getString(getContext().getContentResolver(), Settings.Secure.ANDROID_ID);
}
