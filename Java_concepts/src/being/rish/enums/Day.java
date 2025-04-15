package being.rish.enums;

public enum Day {
    SUNDAY("Sunday", "Ravivar"),
    MONDAY("Monday", "Somvar"),
    TUESDAY("Tuesday", "Mangalvar"),
    WEDNESDAY("Wednesday", "Budhvar"),
    THURSDAY("Thursday", "Guruvar"),
    FRIDAY("Friday", "Sukravar"),
    SATURDAY("Saturday", "Sanivar");

    Day(String lower, String hindi) {
        System.out.println("our constructor called");
        this.lower = lower;
        this.hindi = hindi;
    }

    private String lower;
    private String hindi;

    public String getLower() {
        return lower;
    }

    public String getHindi() {
        return hindi;
    }

    public void display() {
        System.out.println("Today is " + this.name());;
    }
}
