public abstract class Player {
    protected Integer id;
    private String name;
    private Integer baseDamage;
    private float bonusDamagePercent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(Integer baseDamage) {
        this.baseDamage = baseDamage;
    }

    public float getBonusDamagePercent() {
        return bonusDamagePercent;
    }

    public void setBonusDamagePercent(float bonusDamagePercent) {
        this.bonusDamagePercent = bonusDamagePercent;
    }

    public float getFullDamage() {
        float partialDamage = this.baseDamage * ( this.bonusDamagePercent / 100);
        return this.baseDamage + partialDamage;
    }

    public abstract Boolean checkIfHasMaxDamage();

    public String getType() {
        return "Player";
    }

    public String getInfo() {
        return getType() + "{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", full damage=" + this.getFullDamage() +
                '}';
    }
}
