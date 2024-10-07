import java.util.Scanner;

public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public boolean inSameMonth(Holiday otherHoliday) {
        return this.month.equals(otherHoliday.month);
    }

    public static double avgDate(Holiday[] holidays) {
        int totalDays = 0;
        for (Holiday holiday : holidays) {
            totalDays += holiday.day;
        }
        return (double) totalDays / holidays.length;
    }

    @Override
    public String toString() {
        return "Holiday{name = '" + name + "', day = " + day + ", month = '" + month + "'}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of holidays: ");
        int numHolidays = scanner.nextInt();
        scanner.nextLine();  

        Holiday[] holidays = new Holiday[numHolidays];

        for (int i = 0; i < numHolidays; i++) {
            System.out.print("Enter the name of holiday " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter the day of holiday " + (i + 1) + ": ");
            int day = scanner.nextInt();

            scanner.nextLine();  
            System.out.print("Enter the month of holiday " + (i + 1) + ": ");

            String month = scanner.nextLine();

            holidays[i] = new Holiday(name, day, month);
        }

        System.out.println("\nHolidays entered:");
        for (Holiday holiday : holidays) {
            System.out.println(holiday);
        }

        System.out.println("\nTesting inSameMonth method:");

        System.out.print("Enter the index of the first holiday to compare: ");
        int index1 = scanner.nextInt();

        System.out.print("Enter the index of the second holiday to compare: ");
        int index2 = scanner.nextInt();

        if (index1 >= 0 && index1 < numHolidays && index2 >= 0 && index2 < numHolidays) {
            System.out.println("Are the holidays in the same month? " + holidays[index1].inSameMonth(holidays[index2]));
        } else {
            System.out.println("Invalid indices provided.");
        }

        System.out.println("\nThe average day of the holidays is: " + Holiday.avgDate(holidays));

        scanner.close();
    }
}
