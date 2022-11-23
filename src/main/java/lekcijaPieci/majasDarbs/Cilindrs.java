package lekcijaPieci.majasDarbs;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Cilindrs {
    private double radiuss;
    private double augstums;
    double PI = Math.PI;

    Public Cilindrs (int radiuss, int augstums){
    this.radiuss = radiuss;
    this.augstums = augstums;
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

