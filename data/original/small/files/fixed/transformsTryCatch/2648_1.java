public static com.tallty.smart_life_android.fragment.cart.SelectAddress newInstance() {
    android.os.Bundle args = new android.os.Bundle();
    com.tallty.smart_life_android.fragment.cart.SelectAddress fragment = new com.tallty.smart_life_android.fragment.cart.SelectAddress();
    try {
        fragment.setArguments(args);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return fragment;
}
