
package br.com.garagem.dto;

import java.util.Date;

public class VendaDTO {
    private Date dat_vend;
    private double val_vend;

    public Date getDat_vend() {
        return dat_vend;
    }

    public void setDat_vend(Date dat_vend) {
        this.dat_vend = dat_vend;
    }

    public double getVal_vend() {
        return val_vend;
    }

    public void setVal_vend(double val_vend) {
        this.val_vend = val_vend;
    }
    
}
