package com.hkm.po;

public class Speciliofo {
    private Integer spilinfoid;
    private String depinfoid;
    private String spilinfocode;
    private String spilinfoname;
    private Integer spilinfoaim;
    private String spilinfoprodire;

    public Speciliofo(){

    }

    public Integer getSpilinfoid() {
        return spilinfoid;
    }

    public void setSpilinfoid(Integer spilinfoid) {
        this.spilinfoid = spilinfoid;
    }

    public String getDepinfoid() {
        return depinfoid;
    }

    public void setDepinfoid(String depinfoid) {
        this.depinfoid = depinfoid;
    }

    public String getSpilinfocode() {
        return spilinfocode;
    }

    public void setSpilinfocode(String spilinfocode) {
        this.spilinfocode = spilinfocode;
    }

    public String getSpilinfoname() {
        return spilinfoname;
    }

    public void setSpilinfoname(String spilinfoname) {
        this.spilinfoname = spilinfoname;
    }

    public Integer getSpilinfoaim() {
        return spilinfoaim;
    }

    public void setSpilinfoaim(Integer spilinfoaim) {
        this.spilinfoaim = spilinfoaim;
    }

    public String getSpilinfoprodire() {
        return spilinfoprodire;
    }

    public void setSpilinfoprodire(String spilinfoprodire) {
        this.spilinfoprodire = spilinfoprodire;
    }

    @Override
    public String toString() {
        return "Speciliofo{" +
                "spilinfoid=" + spilinfoid +
                ", depinfoid='" + depinfoid + '\'' +
                ", spilinfocode='" + spilinfocode + '\'' +
                ", spilinfoname='" + spilinfoname + '\'' +
                ", spilinfoaim=" + spilinfoaim +
                ", spilinfoprodire='" + spilinfoprodire + '\'' +
                '}';
    }

    public Speciliofo(Integer spilinfoid, String depinfoid, String spilinfocode, String spilinfoname, Integer spilinfoaim, String spilinfoprodire) {
        this.spilinfoid = spilinfoid;
        this.depinfoid = depinfoid;
        this.spilinfocode = spilinfocode;
        this.spilinfoname = spilinfoname;
        this.spilinfoaim = spilinfoaim;
        this.spilinfoprodire = spilinfoprodire;


    }
}
