import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;


public class ReferenceTest {


    public static void main(String[] args) {

        DummyObject dummyObject = new DummyObject(1,"Test1");
        WeakReference<DummyObject> weakRef = new WeakReference<>(dummyObject);
        SoftReference<DummyObject> softRef = new SoftReference<>(new DummyObject(dummyObject));
        DummyObject strongref = new DummyObject(dummyObject);
        dummyObject = null;
        System.gc(); //weak ref will lose ref to object because GC doesnt care about non-strong references (like dummyObject)
        System.out.println("weak ref surived GC ? " + (weakRef.get() == null ? "No." : "Yes"));
        System.out.println("soft ref surived GC ? " + (softRef.get() == null ? "No." : "Yes"));
        System.out.println("strong ref surived GC ? " + (strongref == null ? "No." : "Yes"));

        //weak hashmap clears out strong reference to DummyMeta if Weak Reference to DummyObject gets to be null.
        WeakHashMap<DummyObject, DummyMeta> weakHashMap = new WeakHashMap<>();
        DummyObject d = new DummyObject(12,"Test2");
        weakHashMap.put(d,new DummyMeta());
        DummyMeta dummyMeta = weakHashMap.get(d);
        d = null;
        System.gc();
        System.out.println("strong ref surived GC ? " + (d == null ? "No." : "Yes"));
        String res = "";
        res = weakHashMap.containsValue(dummyMeta) ? "dummyMeta still there" : "dummyMeta cleared!";
        System.out.println(res);
        System.out.println("sqush");
    }
}
