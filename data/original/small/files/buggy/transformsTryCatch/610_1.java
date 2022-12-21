public void test_sum() {
    try {
        addActivity = ((com.example.andrew.lab3add.Add) (getActivity()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    int a = 1;
    int b = 2;
    assertEquals((a + b), addActivity.sum(a, b));
}
