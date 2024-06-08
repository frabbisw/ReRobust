public static boolean right_angle_triangle(int a, int b, int c) {
    return b * b + a * a == c * c || b * b + c * c == a * a || c * c + a * a == b * b;
}
