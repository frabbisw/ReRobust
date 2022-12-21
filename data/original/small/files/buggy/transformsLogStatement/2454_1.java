@java.lang.Override
public void onPlanClicked(com.spadatech.mobile.android.foodframer.models.Plan plan) {
    System.out.println("log");
    android.util.Log.d("Ludens", ("plan: " + (plan.getName().toString())));
}
