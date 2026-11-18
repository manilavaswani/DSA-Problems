package Topics;

public class InstanceClassVariable {
    // Instance variable
    String name;

    // Class variable and final so that its value will notget changed
    static final String company_name = "ABC Corporation";

    public static void main(String[] args) {
        InstanceClassVariable obj1 = new InstanceClassVariable();
        InstanceClassVariable obj2 = new InstanceClassVariable();
        obj1.name = "Manila";

        System.out.println(obj1.name);
        System.out.println(obj2.company_name);
        System.out.println(obj1.company_name);
    }
}
