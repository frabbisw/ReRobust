@org.springframework.web.bind.annotation.RequestMapping(value = "/regCandidate", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String addCandidate(org.springframework.ui.Model model) {
    model.addAttribute("candidate", new ua.com.jobsukraine.entity.Candidate());
    model.addAttribute("vacancies", new java.util.ArrayList<ua.com.jobsukraine.entity.Vacancy>());
    System.out.println("log");
    return "regcandidate/RegCandidateOne";
}
