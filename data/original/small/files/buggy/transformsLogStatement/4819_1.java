public double getPercentDone() {
    int leftToDo = this.estimatedCoursesLeft();
    int done = (totalCoursesNeeded) - leftToDo;
    double result = done / (totalCoursesNeeded);
    System.out.println("log");
    return result;
}
