@java.lang.Override
public void onAttachOrDetach(com.google.gwt.event.logical.shared.AttachEvent event) {
    try {
        init();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
