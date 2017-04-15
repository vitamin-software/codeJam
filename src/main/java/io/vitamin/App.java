package io.vitamin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

abstract class App{
    void run(Scanner in, Function<String, ?> f, Consumer<String> consumer){
       int t = in.nextInt();
       for(int i =1; i<=t; i++){
           String input = in.next();
           Object result = f.apply(input);
           consumer.accept("Case #"+ i + ": "+ result.toString());
       }
   }

   Scanner createScanner(String filename){
       return new Scanner(new BufferedReader( new InputStreamReader(
                               this.getClass().getResourceAsStream(filename)))
       );
   }
}
