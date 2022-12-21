public void loadProblemsForCourse(final org.cloudcoder.app.shared.model.CourseSelection courseSelection) {
    try {
        com.google.gwt.core.client.GWT.log(("Loading problems and submission receipts for course " + (courseSelection.getCourse().getNameAndTitle())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.cloudcoder.app.client.page.SessionUtil.loadProblemAndSubmissionReceiptsInCourse(page, courseSelection, session);
}
