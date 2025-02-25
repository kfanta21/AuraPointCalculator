public class Spirituality {
    //{Attend the Divine Liturgy, Daily Prayers, Read the Word Of God, Confession and Spiritual Reflection, Service}\
    Boolean liturgy;
    int prayers;
    boolean bibleStudy;
    boolean reflection;
    boolean service;
    int mediaHourlyUsage;

    /**
     * Constructs a Spirituality object.
     * @param liturgy         whether the Divine Liturgy is attended
     * @param prayers         number of daily prayers (will contribute logarithmically)
     * @param bibleStudy      whether Bible study is performed
     * @param reflection      whether spiritual reflection/confession is performed
     * @param service         whether service is performed
     * @param mediaHourlyUsage number of hours spent on media (can negatively impact spirituality)
     */
    Spirituality(Boolean liturgy, int prayers, Boolean bibleStudy, boolean reflection, boolean service, int mediaHourlyUsage){
        //Prayer calculation must grow with logarithmic rate.
        this.liturgy = liturgy; // {-1200, +1000} range = 2200
        this.prayers = prayers; // {-400, +700} range = 1100
        this.bibleStudy = bibleStudy; // {-200, +400} range = 600
        this.reflection = reflection; // {-60, +250} range = 310
        this.service = service; // {0, +100} range = 100
        this.mediaHourlyUsage = mediaHourlyUsage; // {negative, no upper limit} effect depends on hours spent (-150 * hours)
    }
    public int totalPoints(){
        int totalPoints = liturgyPoint() + prayersPoint() + bibleStudyPoints() + reflectionPoints()
                + servicePoints() + mediaUsagePoint();
        System.out.println("Today's Spirituality Point: " + totalPoints);
        return totalPoints;
    }

    private int liturgyPoint(){
        if(liturgy == null) { return 0;}
        else if(liturgy){ return 1000;}
        else {return -1200;}
    }
    private int prayersPoint(){
        int points = 0;
        if(prayers == 0){
            points -= 400;
        }
        else if(prayers >= 7){
            points += 700;
        }
        else{
            points += (prayers * 100);
        }
        return points;
    }

    private int bibleStudyPoints(){
        if (bibleStudy){
            return 400;
        }
        return -200;
    }

    private int reflectionPoints(){
        if (reflection){
            return 250;
        }
        return -60;
    }

    private int servicePoints(){
        if (service){
            return 100;
        }
        return 0;
    }

    //no usage = +200, only 1 hr for messaging and all usage = no penalty, other than that it's a huge penalty
    private int mediaUsagePoint(){
        int point = 200;
        if (mediaHourlyUsage == 0){
            return point;
        }
        else if(mediaHourlyUsage < 3) {
            return point + (mediaHourlyUsage * - 200);
        }
        else {
            return point + (mediaHourlyUsage * - 300);
        }
    }

    public double getPoints(){
        return totalPoints();
    }
}
