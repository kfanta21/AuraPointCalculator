public class Spirituality {

    private final LiturgyStatus liturgyStatus;
    private final int prayers;
    private final boolean bibleStudy;
    private final boolean reflection;
    private final boolean service;
    private final int mediaHours;

    public Spirituality(LiturgyStatus liturgyStatus, int prayers, boolean bibleStudy,
                        boolean reflection, boolean service, int mediaHours) {
        this.liturgyStatus = liturgyStatus;
        this.prayers = prayers;
        this.bibleStudy = bibleStudy;
        this.reflection = reflection;
        this.service = service;
        this.mediaHours = mediaHours;
    }

    private int calculateTotalPoints() {
        return liturgyPoint() + prayersPoint() + bibleStudyPoints() + reflectionPoints()
                + servicePoints() + mediaUsagePoint();
    }

    public int getPoints(){
        return calculateTotalPoints();
    }
    public void displayTotalPoints() {
        System.out.println("Today's Spirituality Point: " + calculateTotalPoints());
    }

    private int liturgyPoint() {
        return switch (liturgyStatus) {
            case ATTENDED -> 1000;
            case NOT_ATTENDED -> -1200;
            case NOT_APPLICABLE -> 0;
        };
    }

    private int prayersPoint() {
        if (prayers == 0) return -400;
        return (int) Math.min(700, 100 * Math.log(prayers + 1));
    }

    private int bibleStudyPoints() {
        return bibleStudy ? 400 : -200;
    }

    private int reflectionPoints() {
        return reflection ? 250 : -60;
    }

    private int servicePoints() {
        return service ? 100 : 0;
    }

    private int mediaUsagePoint() {
        if (mediaHours == 0) return 200;
        if (mediaHours < 3) return 200 - (mediaHours * 200);
        else return 200 - (mediaHours * 300);
    }
}