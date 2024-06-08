public static boolean right_angle_triangle(int a, int var, int c) {
    return a * a + var * var == c * c || var * var + c * c == a * a || c * c + a * a == var * var;
}
