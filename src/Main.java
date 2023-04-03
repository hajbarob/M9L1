import java.util.*;

public class Main {
    public static void main(String[] args) {
//        arrayListExapmle();
        //queueExapmle();

        Deque<String> names = new ArrayDeque<>();
        names.add("John");
        names.add("Bill");

        System.out.println(names.poll());
        System.out.println(names.poll());
    }


    public static void arrayExapmle(){
        String[] strArr = new String[5];

        strArr[0] = "aaa";
        strArr[1] = "aaa";
        strArr[2] = "aaa";
        strArr[3] = "aaa";
        strArr[4] = "aaa";
        strArr[5] = "aaa";
    }

    public static void arrayListExapmle(){
        List<String> arrayList = new ArrayList<>();

        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa3");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");

        System.out.println("arrayList.get(2) = " + arrayList.get(2));

        arrayList.add(2, "vova");

        System.out.println("arrayList.get(2) = " + arrayList.get(2));

        System.out.println("arrayList.size() = " + arrayList.size());
        System.out.println("arrayList.contains(\"aaa\") = " + arrayList.contains("aaa"));



    }


    public static void queueExapmle(){
        Queue<String> q = new PriorityQueue<>();
        q.add("1");
        q.add("2");
        q.add("3");

        System.out.println("q.poll() = " + q.poll());

        System.out.println("q.peek() = " + q.peek());
        System.out.println("q.poll() = " + q.poll());

        System.out.println("q.poll() = " + q.poll());

    }
}