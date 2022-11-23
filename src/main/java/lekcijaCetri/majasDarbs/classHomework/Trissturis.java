package lekcijaCetri.majasDarbs.classHomework;

public class Trissturis {
    public int mala1;
    public int mala2;
    public int mala3;
    double laukums;
    
    public Trissturis(){
        System.out.println("Mēs veidojam Trīsstūri");
    }
    public Trissturis (int mala1, int mala2, int mala3){
        this.mala1 = mala1;
        this.mala2 = mala2;
        this.mala3 = mala3;
        laukums = countTriangleArea();

    }

    public double countTriangleArea() {
        double s = (mala1 + mala2 + mala3) / 2;
        return Math.sqrt(s * (s - mala1) + (s - mala2) * (s - mala3));
        }
    public boolean vienadmalu() {

        if ((mala1 == mala2) && (mala1 == mala3))
            return true;
        else return false;
    }
    public boolean vienadsanu() {

        if ((mala1 == mala2) || (mala1== mala3) || (mala2 == mala3))
            return true;
        else return false;

    }


}
