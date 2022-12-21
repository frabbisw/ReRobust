public com.ait.lienzo.client.core.shape.Picture onLoaded(final com.ait.lienzo.client.core.image.PictureLoadedHandler handler) {
    try {
        getImageProxy().setImageShapeLoadedHandler(new com.ait.lienzo.client.core.image.ImageShapeLoadedHandler<com.ait.lienzo.client.core.shape.Picture>() {

            @java.lang.Override
            public void onImageShapeLoaded(com.ait.lienzo.client.core.shape.Picture picture) {
                handler.onPictureLoaded(picture);
            }
        });
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
