public class DailyAura{
    Spirituality spirituality;
    Health health;
    Finance finance;
    Carrer carrer;
    Relationship relationship;

    public DailyAura(Spirituality spirituality, Health health, Finance finance,
                     Carrer carrer, Relationship relationship) {
        this.spirituality = spirituality;
        this.health = health;
        this.finance = finance;
        this.carrer = carrer;
        this.relationship = relationship;
    }

    public double calculateAura(){
        double aura = 0;
        aura += spirituality.getPoints();
        aura += health.getPoints();
        aura += finance.getPoints();
        aura += carrer.getPoints();
        aura += relationship.getPoints();
        //consider drip/highgane
        return aura;
    }
}
