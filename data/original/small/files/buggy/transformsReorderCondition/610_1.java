public void test_sum() {
    addActivity = ((com.example.andrew.lab3add.Add) (getActivity()));
    int a = 1;
    int b = 2;
    assertEquals((b + a), addActivity.sum(a, b));
}
