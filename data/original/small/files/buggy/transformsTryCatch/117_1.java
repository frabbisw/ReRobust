protected net.serenitybdd.core.pages.RenderedPageObjectView getRenderedView() {
    try {
        if ((renderedView) == null) {
            renderedView = new net.serenitybdd.core.pages.RenderedPageObjectView(driver, this, getWaitForTimeout());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return renderedView;
}
