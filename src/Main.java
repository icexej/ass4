public class Main {
    public static void main(String[] args) {
        Employee[] staff = {
                new SocialMediaManager("Aizhan", 101, 2, 900.0, "Instagram", 30000),
                new ContentCreator("Timur", 102, 1, 800.0, "Reels & TikTok", 15),
                new Targetologist("Dana", 103, 3, 1100.0, 6000.0, 4.5)
        };
        System.out.println("=== SMM AGENCY STAFF & TASKS ===");
        for (Employee e : staff) {
            e.displayInfo();

            if (e instanceof Workable) {
                ((Workable) e).performDailyTasks();
                ((Workable) e).attendMeeting("Quarterly Strategy");
            }

            if (e instanceof Reportable) {
                ((Reportable) e).generateReport();
            }

            System.out.println("--------------------------------------------------");
        }
    }
}
