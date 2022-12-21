@java.lang.Override
public void onSecondFragmentRequested() {
    try {
        mFragmentManager.beginTransaction().setCustomAnimations(R.animator.slide_in, 0, R.animator.slide_out, 0).replace(R.id.fragment_container_frame_layout, new com.jiahaoliuliu.dialogfragmentstransition.SecondFragment()).addToBackStack(null).commit();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
