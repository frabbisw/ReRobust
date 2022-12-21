protected net.serenitybdd.core.pages.RenderedPageObjectView getRenderedView() {
    if (null == (renderedView)) {
        renderedView = new net.serenitybdd.core.pages.RenderedPageObjectView(driver, this, getWaitForTimeout());
    }
    return renderedView;
}
