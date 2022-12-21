@org.springframework.web.bind.annotation.RequestMapping(value = "remotes")
public java.util.Collection<com.programyourhome.ir.model.PyhDevice> getRemotes() {
    System.out.println("log");
    return this.infraRed.getDevices();
}
