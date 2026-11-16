static int divide(int val1, int val2) {
    if (val2 == 0) {
        throw new IllegalArgumentException("val2 must not be zero")
    }
    val1 / val2
}
