package com.wzres.lambda1;

import java.util.function.IntPredicate;

/**
 * @ClassName：LambdaTest3
 * @description：
 * @date：2023-05-01 16:02
 */
public class LambdaTest3 {
    public static void main(String[] args) {
        /*printNum(new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value%2==0;
            }
        });*/

        printNum(value ->value%2==0);
    }

    public static void printNum(IntPredicate predicate){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i : arr) {
            if(predicate.test(i)){
                System.out.println(i);
            }
        }
    }
}
