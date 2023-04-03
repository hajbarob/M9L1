package genericExampe;

public class ObjectAsGenericType {

    public Double add(Object a, Object b){
        Number da = (Number) a;
        Number db = (Number) b;
        return /*(Double)*/ da.doubleValue() + db.doubleValue();
     }

    public Double add(Number a, Number b){
        return /*(Double)*/ a.doubleValue() + b.doubleValue();
    }
}
