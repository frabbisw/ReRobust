private void dispose(io.reactivex.disposables.Disposable disposable) {
    try {
        if ((disposable != null) && (!(disposable.isDisposed()))) {
            disposable.dispose();
            disposable = null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
