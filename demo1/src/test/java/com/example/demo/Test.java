package com.example.demo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

class Test {
    public static void main(String[] args) {
        System.out.println("hello world !");
        //Integer i = new Integer(1)；
        int i = 1;
        float j = 1;
        short a = 1;
        byte b = 111;
        long c = 1;
        double d = 1;
        char e = '1';
        String aa = new String("hello");
        boolean bb = false;

        // 对象，指向堆
        Integer ii = new Integer(1);
        Integer jj = new Integer(1);
        // -128-127指向常量池，其他
        Integer cc = 1000;
        Integer ccc = 1000;
        // 基本数据类型
        int dd = 1000;
        int vv = 1000;
        String x = "string";
        String y = "string";
        // == 比较的是对象内存地址
        // 对于引用类型来说是比较引用
//        System.out.println(x==y);
//        Date dt = new Date();
//        System.out.println(dt);
//        System.out.println(e);
//        System.out.println(d);
//        System.out.println(b);
//        System.out.println(aa);
//        String str1 = "通话";
//        String str2 = "重地";
//        System. out. println(String. format("str1：%d | str2：%d",  str1. hashCode(),str2. hashCode()));
//        System. out. println(str1. equals(str2));
//        System.out.println(Math.round(-1.1));

    }
}

class a {

    static class b {
        private String dd = "world";

        protected StringBuffer test() {
            return new StringBuffer("hello ").append(this.dd);
        }

        protected String test2() {
            return "hello " + this.dd;
        }
    }

    protected static class c {
        protected String test() {
            return "hello";
        }
    }

    public static void main(String[] args) {
        System.out.println("hello");
        b h = new b();
        c i = new c();
    }

}

final class bb {


}

abstract class cc {

}

class d extends a {
    private String dd = "world";

    public static void main(String[] args) {
        c x = new c();
        String a = x.test();
        System.out.println(a);
        b y = new b();
        String bb = y.test2();
        System.out.println(bb);
    }


}


class f implements e {

    public static void main(String[] args) {
        //List
//        ArrayList arrayList = new ArrayList();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(null);
//        System.out.println(arrayList);
        System.out.println("arrayList = " + arrayList.get(1));
        System.out.println("arrayList = " + arrayList.remove(arrayList.indexOf(2)));
        System.out.println("arrayList = " + arrayList.get(1));
        LinkedList linkedList = new LinkedList();
        linkedList.add(3);
        linkedList.add(4);
        System.out.println("linkedList = " + linkedList);

        //Map
        HashMap hashMap = new HashMap();
        hashMap.put("a", "1");
        hashMap.put("b", "2");
        hashMap.put(null, 3);
        System.out.println("hashMap = " + hashMap);
        hashMap.clear();
        TreeMap treeMap = new TreeMap();
        treeMap.put("a", 3);
        treeMap.put("b", 4);
        System.out.println("treeMap = " + treeMap);
        Hashtable hashtable = new Hashtable();
        hashtable.put("a", 1);
        hashtable.put("b", 2);
        hashtable.put("c", 3);
        //hashtable.put(null, null);  HashTable不允许空的键值对
        System.out.println("hashtable = " + hashtable);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("1", "1");
        linkedHashMap.put("2", "2");
        linkedHashMap.entrySet();
        System.out.println("linkedHashMap = " + linkedHashMap);
        ConcurrentHashMap conncurrentHashMap = new ConcurrentHashMap();
        conncurrentHashMap.put("a", 1);
        conncurrentHashMap.put("b", 2);
        conncurrentHashMap.put("null", "null");
        System.out.println("conncurrentHashMap = " + conncurrentHashMap);

        //Set
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(2);
        System.out.println("hashSet = " + hashSet.remove(1));
        TreeSet<Object> treeSet = new TreeSet<Object>();
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(7);
        treeSet.add(8);
//        Iterator<Object> itr = treeSet.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
//        for (Object integer: treeSet) {
//            System.out.println(integer);
//        }
        if (treeSet.contains(4)) {
            System.out.println(treeSet.contains(4));
        }

//        try {
//            assert false: "error";
//        }catch (AssertionError e){
//            e.printStackTrace();
//        }
//
//        assertTrue(treeSet.contains(5));


        System.out.println("treeSet = " + treeSet);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        System.out.println("linkedHashSet = " + linkedHashSet);

        //Array
        int[] ints = {2, 3};
        int ints1[];
        double[] doubles = new double[200];
        doubles[199] = 1;
        System.out.println(doubles);
        String[] strings = {"1111", "dfafad"};
        System.out.println("strings = " + strings.getClass());

        //Vector
        Vector vector = new Vector();
        vector.add(1);
        vector.add(1);
        System.out.println("vector = " + vector);


        hashMap.put(null, null);
        System.out.println("hashMap = " + hashMap);

        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("1", "2");
        System.out.println("stringStringHashMap = " + stringStringHashMap);

        HashSet hashSet1 = new HashSet();
        hashSet1.add(1);
        hashSet1.add("2");
        System.out.println("hashSet1 = " + hashSet1);

        HashSet<aaa> aaas = new HashSet<>();
        aaa a = new aaa();
        aaa b = new aaa();
        aaas.add(a);
        aaas.add(b);
        System.out.println(aaas);
    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }
}

class p extends a {
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

class pp {

    private static AtomicInteger atomicCount = new AtomicInteger(0);

    private static void atomicCount() {
        for (int i = 0; i < 10; i++) {
            Executors.newFixedThreadPool(3).execute(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //atomicCount.incrementAndGet()方法的意思是让其自增 1，等同于++
                System.out.println("atomic count: " + atomicCount.incrementAndGet());
            });
        }
    }

    private static volatile int volatileCount = 0;

    private static void volatileCount() {
        for (int i = 0; i < 10; i++) {
            Executors.newFixedThreadPool(3).execute(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("volatile count: " + ++volatileCount);
            });
        }
    }


    // 冒泡排序
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
//        volatileCount();
        int[] arr = {8, 5, 3, 2, 4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                //内层循环，升序（如果前一个值比后一个值大，则交换）
                //内层循环一次，获取一个最大值
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("arr = " + Arrays.toString(arr));
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = "2020-05-23 23:23:30";
        try {
            System.out.println("date = " + simpleDateFormat.parse(dateStr));
        } catch (ParseException e) {
            System.out.println("e = " + e);
        }


        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println("now1 = " + now1);

        System.out.println(System.currentTimeMillis());
        System.exit(0);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int a : arr) {
            System.out.println(a);
        }
        aaa a = new aaa();
        aaa b = new aaa();

        System.out.println(a == b);
        a.ccc();
        Class<?> aaa = a.getClass();
        Field[] fields = aaa.getFields();
        for (Object v : fields) {
            System.out.println("a = " + v);
        }
        Method[] declaredMethods = aaa.getDeclaredMethods();
        for (Object v : declaredMethods) {
            System.out.println("c = " + v);
        }
        System.out.println("aaa = " + aaa.getDeclaredMethods());
        //system.out.println("a = " + a);
    }


}

class aaa {
    private int a;
    protected int b;
    public int c;
    public int d;

    public aaa() {
        this.a = 123;
        this.b = 1;
        this.c = 1;
    }

    public void ccc() {
        System.out.println("a = " + a);
    }

    @Override
    public String toString() {
        return "" + this.a;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        aaa o = (aaa) obj;
        return a == ((aaa) obj).a;
    }

    private void bbb() {

    }
}

//接口
interface e {
    abstract void a();

    void b();
}

//抽象类
abstract class ab {
    abstract void a();

    abstract void ab();
}

class abc extends ab{
    @Override
    void a() {

    }

    @Override
    void ab() {

    }
}