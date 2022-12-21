@org.springframework.web.bind.annotation.RequestMapping(value = "/register", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String processRegistration(@javax.validation.Valid web.quotes.data.User user, org.springframework.validation.Errors errors) {
    if (errors.hasErrors()) {
        return "registerForm";
    }
    try {
        userRepository.save(user);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "redirect:/users/" + (user.getUsername());
}
