package com.rizvi.datastructure;

class Solution_264_not_good {
    public int nthUglyNumber(int n) {
        int count = 0;
        for(int i=0;;i++) {
            if(isUgly(i)) {
//                System.out.println("ugly number; "+i);
                count++;
            }
            if(n == count) {
                return i;
            }
        }
    }
    public boolean isUgly(int num) {
        if (num < 1) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        int x = isDevidedBy2(num);
        //System.out.println("x= " + x);
        int y = isDevidedBy3(x);
        //System.out.println("y= " + y);
        int z = isDevidedBy5(y);
        //System.out.println("z: " + z);
        if (z == 1) return true;
        return false;
    }

    private int isDevidedBy5(int num) {
        if (num == 1) return num;
        if (num % 5 == 0) {
            num = num / 5;
            //System.out.println("isDevidedBy5: " + num);
            num = isDevidedBy5(num);
        }
        //System.out.println("return isDevidedBy5: " + num);
        return num;

    }

    private int isDevidedBy3(int num) {
        if (num == 1) return num;
        if (num % 3 == 0) {
            num = num / 3;
            //System.out.println("isDevidedBy3: " + num);
            num = isDevidedBy3(num);
        }
        //System.out.println("return isDevidedBy3: " + num);
        return num;

    }

    private int isDevidedBy2(int num) {
        if (num == 1) return num;
        if (num % 2 == 0) {
            num = num / 2;
            //System.out.println("isDevidedBy2: " + num);
            num = isDevidedBy2(num);
        }
        //System.out.println("return isDevidedBy2: " + num);
        return num;

    }
}