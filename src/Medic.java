public class Medic  extends  Hero{


    public static void increaseExperience(){
        int healPoint = 0;
        healPoint = healPoint + (healPoint/10);
        }

    @Override
    public void applySuperAbility() {
        setType0fSuperpower("Healing ball");
        System.out.println("Медик применил силу: " + getType0fSuperpower());

    }


}
