package coms309.snacks;

/**
 * Provides the Definition/Structure for the bakery row
 *
 * @author Vivek Bengre
 */

public class Bakery {

    private String name;

    private String location;

    private String[] inventory;

    private String telephone;

    private String hasViennoise;

    public Bakery() {

    }

    public Bakery(String name, String location, String[] inventory, String telephone, String hasViennoise) {
        this.name = name;
        this.location = location;
        this.inventory = inventory;
        this.telephone = telephone;
        this.hasViennoise = hasViennoise;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String[] getInventory() {
        return this.inventory;
    }

    public void setInventory(String[] inventory) {
        this.inventory = inventory;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getHasViennoise() {
        return this.hasViennoise;
    }

    public void setHasViennoise(String hasViennoise) {
        this.hasViennoise = hasViennoise;
    }

    @Override
    public String toString() {
        return name + " "
                + location + " "
                + inventory + " "
                + telephone + " " + hasViennoise;
    }
}
