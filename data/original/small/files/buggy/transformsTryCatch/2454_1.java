@java.lang.Override
public void onPlanClicked(com.spadatech.mobile.android.foodframer.models.Plan plan) {
    try {
        android.util.Log.d("Ludens", ("plan: " + (plan.getName().toString())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
