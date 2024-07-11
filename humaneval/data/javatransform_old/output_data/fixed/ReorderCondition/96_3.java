public static boolean right_angle_triangle(int a, int b, int c) {
    return c * c == a * a + b * b || b * b + c * c == a * a || c * c + a * a == b * b;
}
