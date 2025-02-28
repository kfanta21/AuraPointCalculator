public class DailyAura{
    Spirituality spirituality;
    Health health;
    Finance finance;
    Career career;
    Relationship relationship;

    public DailyAura(Spirituality spirituality, Health health, Finance finance,
                     Career career, Relationship relationship) {
        this.spirituality = spirituality;
        this.health = health;
        this.finance = finance;
        this.career = career;
        this.relationship = relationship;
    }

    public double calculateAura(){
        double aura = 0;
        aura += spirituality.getPoints();
        aura += health.getPoints();
        aura += finance.getPoints();
        aura += career.getPoints();
        aura += relationship.getPoints();
        //consider drip/highgane
        return aura;
    }
}
