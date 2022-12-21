@io.swagger.annotations.ApiOperation(httpMethod = "GET", value = "Resource to get a lesson", response = ua.artcode.model.Lesson.class, produces = "application/json")
@ua.artcode.controller.RequestMapping(value = "/courses/lessons/get", method = RequestMethod.GET)
public ua.artcode.model.Lesson getLessonByID(@ua.artcode.controller.RequestParam int id, javax.servlet.http.HttpServletRequest request) throws ua.artcode.exceptions.AppException {
    ua.artcode.model.Lesson lesson = courseService.getLessonByID(id);
    try {
        ua.artcode.controller.CourseController.LOGGER.info("Lesson get - OK, id {}", id);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return lesson;
}
