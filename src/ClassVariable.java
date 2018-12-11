class Info {
    String name;
    int age;
    String city;
}

public class ClassVariable {

    public static void main(String[] args) {
        Info info1 = new Info();
        info1.age = 33;
        info1.name = "Kinjal";
        info1.city = "Boston";

        System.out.println(info1.name);
        System.out.println(info1.age);
        System.out.println(info1.city);
    }
}
