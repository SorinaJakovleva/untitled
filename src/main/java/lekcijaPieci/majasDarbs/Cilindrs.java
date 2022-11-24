  double lenght;
    int weight;
    String color;
    String species;
    boolean liveInFreshWater = true;
    boolean zivsBeigta = true;
    boolean vaiIzsalkusi = true;
    public void printFish () {
        System.out.println("Tu esi noķēris " + species);
        System.out.println("Tas ir " + color + ", sver " + weight + "kg un ir " + lenght + "cm garš.");
        if (liveInFreshWater == true) {
            System.out.println("Tā ir salūdens zivs.");
        } else {
            System.out.println("Šī zivs mīt sālos ūdeņos.");
        }

    public double getRadiuss(){
        return radiuss;
    }

    public double getAugstums() {
        return augstums;
    }
    public void setRadiuss(double radiuss) {
        this.radiuss = radiuss;
    }
    public void setAugstums(double augstums) {
        this.augstums = augstums;
    }
    //tilpums
    public double rekinatCylindraTilpumu (){
    return PI * (2 * radiuss) * augstums;
    }
    public double rekinatCylindraVirsmasLaukumu() {
        return 2 * PI * radiuss * augstums;
    }

    public Cilindrs(double radiuss, double augstums) {
        this.radiuss = radiuss;
        this.augstums = augstums;
    }

    public Cilindrs() {
        this.radiuss = radiuss;
        this.augstums = augstums;
    }
}

