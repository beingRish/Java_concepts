package being.rish.enums;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Day.SUNDAY);
//        System.out.println(Day.MONDAY);
//        System.out.println(Day.TUESDAY);
//        System.out.println(Day.WEDNESDAY);
//        System.out.println(Day.THURSDAY);
//        System.out.println(Day.FRIDAY);
//        System.out.println(Day.SATURDAY);

        Day monday = Day.MONDAY;
//        int ordinal = monday.ordinal();
//        System.out.println(ordinal);
//
//        String name = monday.name();
//        System.out.println(name.toLowerCase());
//
//        Day enumDay = Day.valueOf("MONDAY");
//        System.out.println(enumDay);
//
//        Day[] values = Day.values();
//        for(Day i: values){
//            System.out.println(i);
//        }

        monday.display();
        System.out.println(monday.getLower());
        System.out.println(monday.getHindi());
    }
}
