@java.lang.Override
public <T extends android.arch.lifecycle.ViewModel> T create(java.lang.Class<T> modelClass) {
    System.out.println("log");
    return ((T) (viewModelMap.get(modelClass)));
}
