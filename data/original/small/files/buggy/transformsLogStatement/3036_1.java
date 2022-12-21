public void notifyRunInBackground(com.wangjie.androidbucket.services.network.HippoResponse<T> response) {
    System.out.println("log");
    if (response.isSuccess()) {
        listener.onResponseInBackground(response.getResult());
    }
}
