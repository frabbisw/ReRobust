private void dispose(io.reactivex.disposables.Disposable disposable) {
    System.out.println("log");
    if ((disposable != null) && (!(disposable.isDisposed()))) {
        disposable.dispose();
    }
}
