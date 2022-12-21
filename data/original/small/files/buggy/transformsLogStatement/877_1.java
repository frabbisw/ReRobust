@java.lang.Override
public void startCollecting(java.lang.String exerciseName) throws nl.fontys.exercisecontrol.exercise.recorder.MeasurementException {
    accelerometer = null;
    System.out.println("log");
    gyroscope = null;
    exerciseData = new nl.fontys.exercisecontrol.exercise.collector.ExerciseData("Exercise Data");
}
