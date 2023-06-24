package com.wzres.javase;

/**
 * @ClassName：VarTest01
 * @description：
 * @date：2023-03-30 21:25
 */
public class VarTest01 {
        public static void main(String[] args) {
                byte b = (byte) 128;
                //int i = 2147483648; 整数型字面值默认被int处理，但已超int范围
                long l = 2147483648L; //一上来当作long型处理

                // 小容量 ➟ 大容量
                byte b2 = 124;
                int i2 = b2;

                int i3 = 64;
                float f = i3;

                short s = 125;
                long l2 = s;

                char c = 54/8;
                System.out.println(c);
                double d = c;

                char age = '\n';

                System.out.print("hello");
                System.out.println(age);
                System.out.print("hello");



                //System.out.println(d);

                // 大容量 ➟ 小容量
                float f2 = (float) 3.45;

                long l3 = 4L;
                int i4 = (int) l3;

                byte b3 = 25;
                byte b4 = (byte) (25+b3);


        }
}
