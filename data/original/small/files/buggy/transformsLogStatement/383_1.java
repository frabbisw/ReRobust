@java.lang.Override
public void onClick(android.view.View v) {
    ((com.abition.self.MainActivity) (context)).newPlanDialog.show(((com.abition.self.MainActivity) (context)).getSupportFragmentManager(), null);
    System.out.println("log");
    com.abition.self.Plan.getUserPlan(context, planList);
}
