package Battle_Of_Mesoketes.Models;

public class Tribe {
    private String tribeName;
    private String weaponName;

    public String getTribeName() {
        return tribeName;
    }

    @Override
    public String toString() {
        return "Tribe [tribeName=" + tribeName + ", weaponName=" + weaponName + "]";
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public void setTribeName(String tribeName) {
        this.tribeName = tribeName;
    }
}
