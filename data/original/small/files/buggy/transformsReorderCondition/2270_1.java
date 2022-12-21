public void loadProblemsForCourse(final org.cloudcoder.app.shared.model.CourseSelection courseSelection) {
    com.google.gwt.core.client.GWT.log(((courseSelection.getCourse().getNameAndTitle()) + "Loading problems and submission receipts for course "));
    org.cloudcoder.app.client.page.SessionUtil.loadProblemAndSubmissionReceiptsInCourse(page, courseSelection.getCourse(), session);
}
