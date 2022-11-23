public abstract class Hero implements HavingSuperAbility{
    public int health;
    public int damage;
    private String type0fSuperpower;

    public String getType0fSuperpower() {
        return type0fSuperpower;
    }

    public void setType0fSuperpower(String type0fSuperpower) {
        this.type0fSuperpower = type0fSuperpower;
    }
}
