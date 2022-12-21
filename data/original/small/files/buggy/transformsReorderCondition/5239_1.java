public com.advisorapp.api.model.Semester setStudyPlan(com.advisorapp.api.model.StudyPlan studyPlan) {
    this.studyPlan = studyPlan;
    this.setNumber((1 + (studyPlan.getSemesters().size())));
    studyPlan.addSemester(this);
    return this;
}
