@java.lang.Override
public void onClick(android.view.View v) {
    try {
        ((com.abition.self.MainActivity) (context)).newPlanDialog.show(((com.abition.self.MainActivity) (context)).getSupportFragmentManager(), null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
