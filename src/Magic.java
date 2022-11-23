public class Magic  extends  Hero{
    @Override
    public void applySuperAbility() {
        setType0fSuperpower("Fireball");
        System.out.println("Маг применил способность: " + getType0fSuperpower());
    }
}
