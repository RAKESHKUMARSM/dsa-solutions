class PowerOfThree {
    public boolean isPowerOfThree(int n) {
       if (n == 1)
        return true;
        if (n < 1 || n == 2)
        return false;
        return checkIsPowerOfThree(n);
    }
    private boolean checkIsPowerOfThree(int n) {
        return n >= 3 ? (n%3 >= 1 ? false : (n/3 == 1 && n%3 == 0) ? true : isPowerOfThree(n/3)) : false;
    }
}
