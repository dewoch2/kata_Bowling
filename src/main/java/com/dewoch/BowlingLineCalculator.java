package com.dewoch;

/**
 * Created by boris on 14/01/2017.
 */
public class BowlingLineCalculator {

    public static int calculate(String line) {

        String replacedLine = line.replace('-', '0');

        int result = 0;
        char c;

        final int lineLength = replacedLine.length();

        for (int i = 0; i < lineLength; i++) {

            c = replacedLine.charAt(i);
            //Strike
            if (c == 'X') {

                int currentIndex = replacedLine.indexOf(c, i);
                int nextFrameIndex = (currentIndex + 2) >= lineLength ? currentIndex : currentIndex + 2;

                result += nextFrameIndex != currentIndex ? 10 : 0;

                while (nextFrameIndex != currentIndex) {

                    String x = String.valueOf(replacedLine.charAt(nextFrameIndex));
                    nextFrameIndex = "/".equals(x)? currentIndex:nextFrameIndex - 1;

                    x = x.replace("X", "10");
                    x = x.replace("/", "10");
                    result += Integer.valueOf(x);

                }

                //Spare
            } else if (c == '/') {

                int currentIndex = replacedLine.indexOf(c, i);
                int nextFrameIndex = (currentIndex + 1) >= lineLength ? currentIndex : currentIndex + 1;

                result += nextFrameIndex != currentIndex ? 10 : 0;


                String x = String.valueOf(replacedLine.charAt(nextFrameIndex));
                x = x.replace("X", "10");
                result += Integer.valueOf(x);
                nextFrameIndex--;


            } else if((i + 1) < lineLength){

                result += replacedLine.charAt(i + 1) == '/'? 0 :(c - 48);
            }

        }

        return result;
    }
}
