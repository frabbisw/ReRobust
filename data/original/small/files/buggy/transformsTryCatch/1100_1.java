@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
public com.manjesh.collector.domain.Event addEvent(@org.springframework.web.bind.annotation.RequestBody com.manjesh.collector.domain.Event event) {
    try {
        java.lang.System.out.println(("Ganesh ==>  " + (event.getOids().size())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return event;
}
