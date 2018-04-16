package io.zipcoder;

class Problem1 {

    public void wuTangPrinter() {
        for(int i = 1; i <= 50; i++) {
            if(toWuTangString(i).equals("")) {
                System.out.println(i);
            } else {
                System.out.println(toWuTangString(i));
            }
        }
    }

    public String toWuTangString(int number) {
        String result = "";
        if(number % 3 == 0 && number % 5 == 0) {
            result = "WuTang";
        } else if (number % 3 == 0) {
            result = "Wu";
        } else if (number % 5 == 0) {
            result = "Tang";
        }
        return result;
    }

    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();
        problem1.wuTangPrinter();
    }
}


