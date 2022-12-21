@controller.RequestMapping(value = "/getNumberOfEvents", method = RequestMethod.GET)
@controller.ResponseBody
public java.lang.Integer getNumberOfEvents(@controller.RequestParam(value = "event_id") int event_id) {
    java.lang.Integer i = courseService.getNumberOfEvents(event_id);
    try {
        java.lang.System.out.println(("Controller (getnumberofevents): ************************* " + i));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return i;
}
