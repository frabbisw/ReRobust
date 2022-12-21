@controller.RequestMapping(method = RequestMethod.GET, produces = "application/json")
@controller.ResponseBody
public java.lang.String loadAllEvents() throws com.fasterxml.jackson.core.JsonProcessingException {
    System.out.println("log");
    return mapper.writeValueAsString(eventService.loadAllEvents());
}
