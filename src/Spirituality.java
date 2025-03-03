/**
 * The Spirituality class represents a daily evaluation of spiritual activities and assigns a point-based
 * score based on various spiritual disciplines.
 */
public class Spirituality {

    private final LiturgyStatus liturgyStatus;
    private final int prayers;
    private final boolean bibleStudy;
    private final boolean reflection;
    private final boolean service;
    private final int mediaHours;

    /**
     * Constructs a Spirituality object with the specified parameters.
     *
     * @param liturgyStatus The status of attending liturgy.
     * @param prayers The number of prayers performed.
     * @param bibleStudy Whether Bible study was performed.
     * @param reflection Whether self-reflection was performed.
     * @param service Whether service to others was performed.
     * @param mediaHours The number of hours spent on media consumption.
     */
    public Spirituality(LiturgyStatus liturgyStatus, int prayers, boolean bibleStudy,
                        boolean reflection, boolean service, int mediaHours) {
        this.liturgyStatus = liturgyStatus;
        this.prayers = prayers;
        this.bibleStudy = bibleStudy;
        this.reflection = reflection;
        this.service = service;
        this.mediaHours = mediaHours;
    }

    /**
     * Calculates the total spirituality points based on various activities.
     * @return Total spirituality score.
     */
    private int calculateTotalPoints() {
        return liturgyPoint() + prayersPoint() + bibleStudyPoints() + reflectionPoints()
                + servicePoints() + mediaUsagePoint();
    }

    /**
     * Retrieves the total spirituality points.
     * @return Total points.
     */
    public int getPoints(){
        return calculateTotalPoints();
    }
    /**
     * Displays the total spirituality points for the day.
     */
    public void displayTotalPoints() {
        System.out.println("Today's Spirituality Point: " + calculateTotalPoints());
    }

    /**
     * Calculates the points based on liturgy attendance.
     */
    private int liturgyPoint() {
        return switch (liturgyStatus) {
            case ATTENDED -> 1000;
            case NOT_ATTENDED -> -1200;
            case NOT_APPLICABLE -> 0;
        };
    }

    /**
     * Calculates points based on the number of prayers performed.
     */
    private int prayersPoint() {
        if (prayers == 0) return -400;
        return (int) Math.min(700, 100 * Math.log(prayers + 1));
    }

    /**
     * Calculates points for Bible study.
     */
    private int bibleStudyPoints() {
        return bibleStudy ? 400 : -200;
    }

    /**
     * Calculates points for self-reflection.
     */
    private int reflectionPoints() {
        return reflection ? 250 : -60;
    }

    /**
     * Calculates points for service to others.
     */
    private int servicePoints() {
        return service ? 100 : 0;
    }

    /**
     * Calculates the penalty or reward based on media usage.
     */
    private int mediaUsagePoint() {
        if (mediaHours == 0) return 200;
        if (mediaHours < 3) return 200 - (mediaHours * 200);
        else return 200 - (mediaHours * 300);
    }
}