package sindhu.assignment;

public class Singleton {
    String str;
    public static Singleton assignString(String assign){
        //static method cannot access non-static context
        //str=assign;
        Singleton singleton=new Singleton();
        return singleton;
    }
    public void printString(){
        System.out.println(str);
    }
}
