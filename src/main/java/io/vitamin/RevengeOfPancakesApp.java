package io.vitamin;

import java.util.Scanner;

public class RevengeOfPancakesApp extends App{

    int flipper(String pancakes){
        char[] smileIndicators = pancakes.toCharArray();
        char current = smileIndicators[0];

        int flip = 0;
        for(int i = 1; i<smileIndicators.length; i++){
            if(current != smileIndicators[i]){
                flip += 1;
                current = smileIndicators[i];
            }
        }

        if(current == '-'){
            flip += 1;
        }
        return flip;
    }

    public static void main(String args[]){
        RevengeOfPancakesApp app = new RevengeOfPancakesApp();
        Scanner in = app.createScanner("/Revenge-small-practice.in");
        app.run(in, app::flipper, System.out::println);
    }

}
