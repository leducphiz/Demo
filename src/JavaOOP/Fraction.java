/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP;

/**
 *
 * @author PhiLe
 */
public class Fraction {

    private int tuso, mauso;

    public Fraction() {
    }

    public Fraction(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }

    /**
     * đây là hàm ghi đè đưuọc viết lại trên cơ sở của một hàm đã có ở lớp cha
     *
     * @return
     */
    @Override
    public String toString() {
        return tuso + "/" + mauso;
    }

    public Fraction toiGian() {
        Fraction F = new Fraction();
        F.tuso = this.tuso / UCLN(this.tuso, this.mauso);
        F.mauso = this.mauso / UCLN(this.tuso, this.mauso);

        return F;
    }

    private int UCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public Fraction cong(Fraction F1, Fraction F2) {
        Fraction F = new Fraction();

        F.tuso = F1.mauso * F2.mauso + F2.tuso * F1.mauso;
        F.mauso = F1.mauso * F2.mauso;
        
        return F;
    }
}
