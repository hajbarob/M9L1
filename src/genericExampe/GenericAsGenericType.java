package genericExampe;

public class GenericAsGenericType {

    // <T> -> any type
    // <T extends Number> -> any type which extended from number
//    public <NumberType> Double add(NumberType a, NumberType b){
//        Number da = (Number) a;
//        Number db = (Number) b;
//        return /*(Double)*/ da.doubleValue() + db.doubleValue();
//    }

    public <T extends Number> Double add(T a, T b){
        return /*(Double)*/ a.doubleValue() + b.doubleValue();
    }

}
