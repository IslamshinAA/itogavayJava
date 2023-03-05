public class Notebook {

    private Integer ram;
    private Integer hdd;
    private String oc;
    private String color;

    public Notebook(Integer ram, Integer hdd, String oc, String color) {
    this.ram = ram;
    this.hdd = hdd;
    this.oc = oc;
    this.color = color;
    }
    @Override
    public String toString() {
        return ram + "-Gb, " + hdd + "-Gb, " + "OS: " + oc + ", Color: " + color;
    }

    public Integer getHdd() {
        return hdd;
    }

    public Integer getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }

    public String getOc(){
        return oc;
    }
}

