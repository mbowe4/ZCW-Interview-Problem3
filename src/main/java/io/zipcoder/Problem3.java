package io.zipcoder;

class Problem1 {

    public String wuTangPrinter(int maxNum) {
        StringBuilder builder = new StringBuilder();
        for(int i = 1; i <= maxNum; i++) {
            if(toWuTangString(i).equals("")) {
                builder.append(i).append(", ");
            } else if (i <= maxNum-1) {
                builder.append(toWuTangString(i)).append(", ");
            } else {
                builder.append(toWuTangString(i));
            }
        }
        return builder.toString();
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
}


