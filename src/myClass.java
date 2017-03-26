
public class myClass {
    public static void main(String[] args) {

        DB db= new DB("Rizvan").SetObject();
        System.out.println(db.hashCode());
        DB db1= new DB("Yousuf").SetObject();
        System.out.println(db1.hashCode());

    }
    }
