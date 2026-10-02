public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("General Staff", 100, 1, 600.0);
        SocialMediaManager smm = new SocialMediaManager("Aizhan", 101, 2, 1100.0, "Instagram", 25000);
        ContentCreator creator = new ContentCreator("Timur", 102, 3, 1300.0, "Reels & TikToks", 12);
        Targetologist target = new Targetologist("Dana", 103, 4, 1600.0, 5000.0, 4.2);


        Employee defaultEmp = new Employee();
        System.out.println("=== DEFAULT EMPLOYEE TEST ===");
        defaultEmp.displayInfo();

        System.out.println("\n=== DIGITAL AGENCY STAFF (POLYMORPHISM DEMO) ===");
        Employee[] staff = { emp1, smm, creator, target };

        for (Employee e : staff) {
            e.displayInfo();

            System.out.println("   [Getter check] ID: " + e.getId() +
                    ", Experience: " + e.getExperienceYears() +
                    " yrs, Base Salary: $" + e.getBaseSalary());
            System.out.println("--------------------------------------------------");
        }

        System.out.println("\n=== TESTING UNIQUE SUBCLASS METHODS ===");
        smm.publishPost("New Spring Collection Lookbook");
        smm.analyzeMetrics();

        creator.shootContent();
        creator.editReels();

        target.setupAdCampaign();
        target.optimizeCPA();

        System.out.println("\n=== TESTING SETTERS & VALIDATION ===");
        smm.setFollowersCount(-500);
        smm.setFollowersCount(32000);
        System.out.println("Updated followers for " + smm.getName() + ": " + smm.getFollowersCount());

        System.out.println("   [Platform check] " + smm.getPlatform());
    }
}