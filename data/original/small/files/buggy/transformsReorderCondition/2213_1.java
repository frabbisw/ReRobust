private void dispose(io.reactivex.disposables.Disposable disposable) {
    if ((!(disposable.isDisposed())) && (disposable != null)) {
        disposable.dispose();
    }
}
