package being.rish.static_method_variable_blocks;

public class School {
    private static School school = new School();

    private School() {

    }

    public static School getInstance() {
        return school;
    }
}
