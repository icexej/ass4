class ContentCreator extends Employee implements Workable, Reportable{
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
        return getBaseSalary() + (weeklyVideos*30);
    }

    @Override
    public String getRoleDescription() {
        return "Produces and edits video content (" + contentType + ") for social platforms";
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
        System.out.println("-> Creator " +getName()+ " is producting " + contentType);
    }

    @Override
    public void attendMeeting(String topic) {
        System.out.println("-> Creator " + getName()+ " attending creative sync on " + topic);

    }

    @Override
    public void generateReport() {
        System.out.println("-> Content Creator " + getName() + " generated media performance report.");
    }
}

