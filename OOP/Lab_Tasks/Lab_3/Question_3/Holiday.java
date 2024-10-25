package Question_3;

public class Holiday {

    private String name;
    private int day;
    private String month;

    Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public boolean inSameMonth(Holiday otherHoliday) {
        return this.month.equals(otherHoliday.month);
    }

    public static double avgDate(Holiday[] holidays) {
        int sum = 0;
        for (Holiday holiday : holidays) {
            sum += holiday.day;
        }
        return (double) sum / holidays.length;
    }

    public static void main(String[] args) {

        Holiday h1 = new Holiday("New Year", 1, "January");
        Holiday h2 = new Holiday("Independence Day", 4, "July");
        Holiday h3 = new Holiday("Christmas", 25, "December");

        System.out.println(h1.inSameMonth(h2));
        System.out.println(h1.inSameMonth(new Holiday("Another Holiday", 15, "January")));

        Holiday[] holidays = { h1, h2, h3 };
        System.out.println("Average day: " + Holiday.avgDate(holidays));
    }
}