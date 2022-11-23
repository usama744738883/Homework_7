public class Warrior  extends Hero{
    @Override
    public void applySuperAbility() {
        setType0fSuperpower("Absorb damage");
        System.out.println("Воин применил силу: " + getType0fSuperpower());
    }
}
