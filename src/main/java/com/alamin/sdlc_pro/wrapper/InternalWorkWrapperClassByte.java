package com.alamin.sdlc_pro.wrapper;

public class InternalWorkWrapperClassByte {
    public static void main(String[] args) {
        // TODO:  Byte.valueOf(
        //     string ,
        //     radix = (binary\octal\decimal\hexadecimal\((0 to 9)+(A to Z))=36)
        //  );

        int binary = 2;
        int octal = 8;
        int decimal = 10;
        int hexadecimal = 16;
        int a_z_0_9 = 36;
        System.out.println(Byte.valueOf("1010", binary));
        System.out.println(Byte.valueOf("137", octal));
        System.out.println(Byte.valueOf("97", decimal));
        System.out.println(Byte.valueOf("F", hexadecimal));
        System.out.println(Byte.valueOf("Z", a_z_0_9));
        System.out.println("Decode Value");
//        System.out.println(Byte.decode("0b101"));
        System.out.println(Byte.decode("065"));
        System.out.println(Byte.decode("89"));
        System.out.println(Byte.decode("0xF"));
        for (int i = -128; i < 128; i++){
            System.out.println(i + " == " +Byte.toUnsignedInt((byte) i));
        }
    }
}
