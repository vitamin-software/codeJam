package io.vitamin;

import java.util.*;

public class CountingSheepApp extends App {
    private final Collection<Integer> sleptCheck = new HashSet<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));

    List<Integer> digitExtractor(long num, List<Integer> list){
        if(num >= 10){
            list.add((int)(num % 10));
            return digitExtractor(num / 10, list);
        } else if(num > 0){
            list.add((int)num);
        }
        return list;
    }

    List<Integer> toDigits(long number){
        return digitExtractor(number, new LinkedList<>());
    }

    boolean slept(Collection<Integer> sleeping){
        return sleptCheck.equals(sleeping);
    }

    long sleep(long start, Set<Integer> seen, int depth){
        if(start == 0)
            return 0;

        seen.addAll(toDigits((depth + 1) * start));
        if(slept(seen))
            return (depth + 1) * start;

        if(depth > 100)
            return 0;

        return sleep(start, seen, depth + 1);
    }

    long sleep(String start){
        return sleep(Long.valueOf(start), new HashSet<>(), 0);
    }

    public static void main(String args[]){
        CountingSheepApp app = new CountingSheepApp();
        Scanner in = app.createScanner("/Counting-small-practice.in");
        app.run(in, app::sleep, System.out::println);
    }
}
