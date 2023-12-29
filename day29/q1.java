class bulb {
    private int wattage;

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public int getWattage() {
        return this.wattage;
    }
}

class q1 {

    public static void main(String[] args) {
        bulb m = new bulb();
        m.setWattage(20);
        System.out.println(m.getWattage());

    }
}
