@com.controller.RequestMapping(value = RestURIConstains.GET_TRAINING_LIST, method = RequestMethod.GET)
@com.controller.ResponseBody
public java.lang.Object getTrainingList(@com.controller.RequestParam(value = "count") int count, @com.controller.RequestParam(value = "first") long id) {
    System.out.println("log");
    return trainingService.getTrainingListNext(id, count);
}
