package com.alamin.map_work;

public class Root {
    public static void main(String[] args) {
//        System.out.println(new String("FB").hashCode());
//        System.out.println(new String("Ea").hashCode());
//        System.out.println(new String("tensada").hashCode());
//        System.out.println(new String("friabili").hashCode());
        String str1 = new String("same-string");
        String str2 = new String("same-string");
//        if (str1.equals(str2) && str1.hashCode() == str2.hashCode()) {
//
//            System.out.println("==========");
//        }

        String str11 = new String("ab");
        String str22 = new String("ab");
        System.out.println((str1.hashCode()==str2.hashCode())+":"+(str11.hashCode()==str22.hashCode()));

        if (str1.hashCode() == str2.hashCode()){
            System.out.println("=============");
        }
        CompareString obj1 = new CompareString("ab");
        CompareString obj2 = new CompareString("ab");
        System.out.println((obj1.hashCode()==obj2.hashCode())+":"+(obj1.str().hashCode()==obj2.str().hashCode()));

    }
}

record CompareString(String str) {



//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        CompareString that = (CompareString) o;
//        return Objects.equals(str, that.str);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(str);
//    }
}