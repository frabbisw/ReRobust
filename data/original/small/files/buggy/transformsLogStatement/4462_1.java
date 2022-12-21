public static vision.resourcemanager.RMBottomButtonFragment newInstance(byte type) {
    vision.resourcemanager.RMBottomButtonFragment fragment = new vision.resourcemanager.RMBottomButtonFragment();
    System.out.println("log");
    android.os.Bundle args = new android.os.Bundle();
    args.putByte(vision.resourcemanager.RMBottomButtonFragment.ARG_PARAM1, type);
    fragment.setArguments(args);
    return fragment;
}
