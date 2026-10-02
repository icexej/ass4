
class SocialMediaManager extends Employee implements Workable, Reportable {
    private String platform;
    private int followersCount;

    public SocialMediaManager(String name, int id, int experienceYears, double baseSalary, String platform, int followersCount) {
        super(name, id, experienceYears, baseSalary);
        setPlatform(platform);
        setFollowersCount(followersCount);
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = (platform != null && !platform.isEmpty()) ? platform : "Instagram";
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = (followersCount >= 0) ? followersCount : 0;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (getExperienceYears()*100);
    }

    @Override
    public String getRoleDescription() {
        return "Manages social media presence and community engagement on " + platform;
    }

    @Override
    public void performDailyTasks() {
        System.out.println("--> SMM Manager " + getName() + " is publishing posts on " + platform);
    }

    @Override
    public void attendMeeting(String topic) {
        System.out.println("--> SMM Manager " + getName() + " attending meeting on: " + topic);
    }

    public void publishPost(String title) {
        System.out.println("-> SMM " + getName() + " published post: '" + title + "' on " + platform);
    }

    public void analyzeMetrics() {
        System.out.println("-> SMM " + getName() + " is analyzing engagement metrics for " + platform);
    }

    @Override
    public void displayInfo() {
        System.out.print("[SMM Manager] ");
        super.displayInfo();
        System.out.println("   -> Platform: " + platform + " | Followers: " + followersCount);
    }

    @Override
    public void generateReport() {
        System.out.println("-> SMM Manager " + getName() + " generated monthly analytics report.");
    }
}