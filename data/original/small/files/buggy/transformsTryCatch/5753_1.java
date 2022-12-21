@java.lang.Override
public void onClick(android.view.View v) {
    try {
        com.example.admin.a1_workout.ui.WorkoutActivity.startActivity(getApplicationContext(), holder.getAdapterPosition());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
