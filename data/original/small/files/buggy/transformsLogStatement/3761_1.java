@org.springframework.web.bind.annotation.RequestMapping(value = "/create", method = org.springframework.web.bind.annotation.RequestMethod.POST, headers = "Accept=application/json")
public com.codeproj.traininghandler.rest.common.GeneralIdResponse create(@org.springframework.web.bind.annotation.RequestBody com.codeproj.traininghandler.dto.UserDto user) throws com.codeproj.traininghandler.exceptions.ValidationException {
    System.out.println("log");
    return createUser(user, true, false);
}
