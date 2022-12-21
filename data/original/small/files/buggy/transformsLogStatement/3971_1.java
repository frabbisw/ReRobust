@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR)
@org.springframework.web.bind.annotation.ExceptionHandler(value = net.identio.server.exceptions.ServerException.class)
private java.lang.String handleServerException() {
    System.out.println("log");
    return errorController.displayErrorPage("error.server");
}
