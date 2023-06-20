class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n == 1)
        return true;
        if (n < 1 || (n > 1 && n < 4))
        return false;
        return checkIsPowerOfFour(n);
    }

    private boolean checkIsPowerOfFour(int n) {
        if (n >= 4)
return n%4 >= 1 ? false : (n/4 == 1 && n%4 == 0) ? true : checkIsPowerOfFour(n/4);
else 
return false;
    }
}
