class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n < 1)
        return false;
        if (n == 1)
        return true;
        int quotient = n/2;
        int reminder = n%2;
        if (reminder == 1) 
        return false;
        if (quotient == 1 && reminder == 0)
            return true;
        return isPowerOfTwo(quotient);
    }
}
