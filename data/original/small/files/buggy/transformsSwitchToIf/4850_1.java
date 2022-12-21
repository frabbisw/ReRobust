@java.lang.Override
public void onClick(android.view.View v) {
    if (v.getId() == R.id.home_find_bringer) {
        android.content.Intent intent = new android.content.Intent(getActivity(), com.morgane.painauchocolat.activities.BringerActivity.class);
        startActivityForResult(intent, Constant.REQUEST_CODE_FIND_BRINGER);
    }
}
