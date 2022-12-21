public static vision.resourcemanager.RMBottomButtonFragment newInstance(byte type) {
    vision.resourcemanager.RMBottomButtonFragment fragment = new vision.resourcemanager.RMBottomButtonFragment();
    android.os.Bundle args = new android.os.Bundle();
    try {
        args.putByte(vision.resourcemanager.RMBottomButtonFragment.ARG_PARAM1, type);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    fragment.setArguments(args);
    return fragment;
}
