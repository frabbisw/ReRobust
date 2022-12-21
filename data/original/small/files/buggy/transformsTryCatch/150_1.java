private void postProcessItemInsert(@javax.annotation.Nonnull illarion.client.graphics.Item newItem) {
    try {
        if (orderNotSet) {
            setOrder(newItem.getOrder());
            show();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    rectangleDirty = true;
    newItem.show();
}
