public static boolean right_angle_triangle(int a, int b, int c) {
    return a * a + b * b == c * c || c * c + b * b == a * a || c * c + a * a == b * b;
}
