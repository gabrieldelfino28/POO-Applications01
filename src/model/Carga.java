package model;

public final class Carga extends Veiculo{
    private int cargaMax;
    private int tara;

    public Carga() {
        super();
    }

    @Override
    public float calcVel(float velocMax) {
        return velocMax * 100000;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }


}
