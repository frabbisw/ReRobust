@java.lang.Override
public void onCommentEdit(org.dhis2.android.dashboard.api.models.InterpretationComment comment) {
    try {
        org.dhis2.android.dashboard.ui.fragments.interpretation.InterpretationCommentEditFragment.newInstance(comment.getId()).show(getChildFragmentManager());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
