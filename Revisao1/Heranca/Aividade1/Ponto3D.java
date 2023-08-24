package Revisao1.Heranca.Aividade1;

public class Ponto3D extends Ponto2D{
    double z;

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString(){
        return super.toString() + "," + getZ();
    }
}
