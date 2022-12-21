@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String processRegistration(web.quotes.data.User user) {
    try {
        userRepository.save(user);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "redirect:/users/" + (user.getUsername());
}
