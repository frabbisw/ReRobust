public static boolean right_angle_triangle(int var, int b, int c) {
    return var * var + b * b == c * c || b * b + c * c == var * var || c * c + var * var == b * b;
}
