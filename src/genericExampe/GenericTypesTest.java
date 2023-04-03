package genericExampe;

public class GenericTypesTest {

    public static void main(String[] args) {
        //noGenericTest();
        //objectAsGenericTest();
        genericAsGenericTest();
    }

    public static void noGenericTest(){
        NoGenericTypeExample ng = new NoGenericTypeExample();
        System.out.println("ng.add(5, 7) = " + ng.add(5, 7));
        System.out.println("ng.add(5L, 7) = " + ng.add(5L, 7));
        System.out.println("ng.add(5.1, 7) = " + ng.add(5.1, 7));
        System.out.println("ng.add(5.1F, 7) = " + ng.add(5.1F, 7));
    }

    public static void objectAsGenericTest(){
        int a = 9;
        Integer oi = a;
        int b = (int) oi;
        System.out.println("oi = " + oi);

        ObjectAsGenericType og = new ObjectAsGenericType();
        System.out.println("og.add(5, 7) = " + og.add(Integer.valueOf(5), (Integer) 7));
        System.out.println("og.add(5L, 7) = " + og.add(5L, 7));
        System.out.println("og.add(5.1, 7) = " + og.add(5.1, 7));
        System.out.println("og.add(5.1F, 7) = " + og.add(5.1F, 7));
    }

    public static void genericAsGenericTest(){
        GenericAsGenericType og = new GenericAsGenericType();
        System.out.println("og.add(5, 7) = " + og.add(Integer.valueOf(5), (Integer) 7));
        System.out.println("og.add(5L, 7) = " + og.add(5L, 7));
        System.out.println("og.add(5.1, 7) = " + og.add(5.1, 7));
        System.out.println("og.add(5.1F, 7) = " + og.add(5.1F, 7));
    }
}
