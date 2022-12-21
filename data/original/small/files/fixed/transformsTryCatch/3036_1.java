public void notifyRunInBackground(com.wangjie.androidbucket.services.network.HippoResponse<T> response) {
    try {
        if (response.isSuccess()) {
            if ((listener) != null)
                listener.onResponseInBackground(response.getResult());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
