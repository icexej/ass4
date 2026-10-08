class Targetologist extends Employee implements Workable, Reportable {
    private double monthlyAdBudget;
    private double conversionRate;

    public Targetologist(String name, int id, int experienceYears, double baseSalary, double monthlyAdBudget, double conversionRate) {
        super(name, id, experienceYears, baseSalary);
        setMonthlyAdBudget(monthlyAdBudget);
        setConversionRate(conversionRate);
    }

    public double getMonthlyAdBudget() {
        return monthlyAdBudget;
    }

    public void setMonthlyAdBudget(double monthlyAdBudget) {
        this.monthlyAdBudget = (monthlyAdBudget >= 0) ? monthlyAdBudget : 0.0;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionRate = (conversionRate >= 0 && conversionRate <= 100) ? conversionRate : 1.5;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary()+(monthlyAdBudget*0.02);
    }

    @Override
    public String getRoleDescription() {
        return "Manages paid advertising campaigns and optimizes ROI/CPA";
    }

    @Override
    public void displayInfo() {
        System.out.print("[Targetologist] ");
        super.displayInfo();
        System.out.println("   -> Ad Budget: $" + monthlyAdBudget + " | Conversion Rate: " + conversionRate + "%");
    }

    public void setupAdCampaign() {
        System.out.println("-> Targetologist " + getName() + " launched target ads with budget $" + monthlyAdBudget);
    }

    public void optimizeCPA() {
        System.out.println("-> Targetologist " + getName() + " is optimizing Cost-Per-Acquisition.");
    }

    @Override
    public void performDailyTasks() {
        System.out.println("-> Targetologist " + getName() + " is monitoring active ad campaigns.");
    }

    @Override
    public void attendMeeting(String topic) {
        System.out.println("-> Targetologist " + getName() + " attending analytics sync on: " + topic);
    }

    @Override
    public void generateReport() {
        System.out.println("-> Targetologist " + getName() + " generated advertising ROI report.");
    }
}
