package view;

import model.Carga;
import model.Motor;
import model.Passeio;

public class Test {

    public static void main(String[] args) {
        Motor mp = new Motor();
        mp.setPotencia(150);
        mp.setQtdPist(20);
        Motor mc = new Motor();
        mc.setPotencia(400);
        mc.setQtdPist(40);
        Passeio p1 = new Passeio();
        p1.setQtdPassageiros(4);
        p1.setCor("Roxo");
        p1.setMarca("Marca F");
        p1.setModelo("Modelo K");
        p1.setPlaca("AMCK-45C");
        p1.setQtdRodas(4);
        p1.setMotor(mp);
        p1.setVelocMax(250);
        System.out.println(String.format("%.2f", p1.calcVel(p1.getVelocMax())) + " m/h");

        Passeio p2 = new Passeio();
        p2.setQtdPassageiros(5);
        p2.setCor("Vermelho");
        p2.setMarca("Marca X");
        p2.setModelo("Modelo Z");
        p2.setPlaca("VL3K-2XA");
        p2.setQtdRodas(4);
        p2.setMotor(mp);
        p2.setVelocMax(230);
        System.out.println(String.format("%.2f", p2.calcVel(p2.getVelocMax())) + " m/h");

        Carga c1 = new Carga();
        c1.setCargaMax(300);
        c1.setTara(2);
        c1.setCor("Azul");
        c1.setMarca("Marca XX");
        c1.setModelo("Modelo AK2");
        c1.setPlaca("3X1A-ZPA");
        c1.setQtdRodas(6);
        c1.setVelocMax(160);
        c1.setMotor(mc);
        System.out.println(String.format("%.2f", c1.calcVel(c1.getVelocMax())) + " c/h");

        Carga c2 = new Carga();
        c2.setCargaMax(600);
        c2.setTara(4);
        c2.setCor("Azul");
        c2.setMarca("Marca XX");
        c2.setModelo("Modelo AX3");
        c2.setPlaca("ZA13-A3A");
        c2.setQtdRodas(8);
        c2.setVelocMax(135);
        c2.setMotor(mc);
        System.out.println(String.format("%.2f", c2.calcVel(c2.getVelocMax())) + " c/h");

    }
}
