class ContentCreator extends Employee {
    private String contentType;
    private int weeklyVideos;

    public ContentCreator(String name, int id, int experienceYears, double baseSalary, String contentType, int weeklyVideos) {
        super(name, id, experienceYears, baseSalary);
        setContentType(contentType);
        setWeeklyVideos(weeklyVideos);
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = (contentType != null && !contentType.isEmpty()) ? contentType : "Video";
    }

    public int getWeeklyVideos() {
        return weeklyVideos;
    }

    public void setWeeklyVideos(int weeklyVideos) {
        this.weeklyVideos = (weeklyVideos >= 0) ? weeklyVideos : 0;
    }

    @Override
    public double calculateSalary() {
        return 0;
    }

    @Override
    public void displayInfo() {
        System.out.print("[Content Creator] ");
        super.displayInfo();
        System.out.println("   -> Content Type: " + contentType + " | Weekly Output: " + weeklyVideos + " items");
    }

    public void shootContent() {
        System.out.println("-> Creator " + getName() + " is shooting new " + contentType + " content.");
    }

    public void editReels() {
        System.out.println("-> Creator " + getName() + " is editing trending reels in Premiere Pro/CapCut.");
    }

    @Override
    public void performDailyTasks() {

    }

    @Override
    public void attendMeeting(String topic) {

    }
}

