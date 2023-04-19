public class Root {
    public native void sayHello();
    public static void main(String[] args){
        new Root().sayHello();

    }
    static{
        System.load("D:\\java\\CreatedNativeMethod\\libJNI.dll");
    }
}
