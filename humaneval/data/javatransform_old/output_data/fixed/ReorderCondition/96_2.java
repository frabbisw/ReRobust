public static boolean right_angle_triangle(int a, int b, int c) {
    return b * b + c * c == a * a || a * a + b * b == c * c || c * c + a * a == b * b;
}
