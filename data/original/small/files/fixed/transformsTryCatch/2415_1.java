@org.springframework.web.bind.annotation.RequestMapping(value = "/show/{id}")
public java.lang.String show(@org.springframework.web.bind.annotation.PathVariable int id, org.springframework.ui.Model model) {
    try {
        initShow(model, id);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "train/show";
}
