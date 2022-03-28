import java.util.ArrayList;

public class Planet {
    private int orbitTime;
    private ArrayList<Moon> moon;
    private String designation;
    public Planet() {

    }
    public Planet(int orbitTime, String designation) {

    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public ArrayList<Moon> getMoon() {
        return moon;
    }

    public void setMoon(ArrayList<Moon> moon) {
        this.moon = moon;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

