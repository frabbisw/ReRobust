@java.lang.Override
public void onPause() {
    try {
        super.onPause();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.example.nicco.inspectionReviewManager.customDatatypes.Model model = ((com.example.nicco.inspectionReviewManager.customDatatypes.Model) (getApplicationContext()));
    model.reset();
}
