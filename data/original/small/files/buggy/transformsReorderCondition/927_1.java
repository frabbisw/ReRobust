@java.lang.Override
public void ok(android.content.DialogInterface dialog) {
    if (0 == (states.compareTo(com.noisyninja.abheda_droid.fragment.PictureMatchDetailFrag.STATES.LAST))) {
        dialog.dismiss();
        com.noisyninja.abheda_droid.util.Utils.showReview(getActivity());
    }
}
