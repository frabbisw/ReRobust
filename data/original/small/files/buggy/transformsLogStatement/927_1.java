@java.lang.Override
public void ok(android.content.DialogInterface dialog) {
    System.out.println("log");
    if ((states.compareTo(com.noisyninja.abheda_droid.fragment.PictureMatchDetailFrag.STATES.LAST)) == 0) {
        dialog.dismiss();
        com.noisyninja.abheda_droid.util.Utils.showReview(getActivity());
    }
}
