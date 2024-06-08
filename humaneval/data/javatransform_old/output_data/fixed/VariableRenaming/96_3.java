public static boolean right_angle_triangle(int a, int b, int var) {
    return a * a + b * b == var * var || b * b + var * var == a * a || var * var + a * a == b * b;
}
