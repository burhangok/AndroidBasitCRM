package com.burhangok.basitcrm;

import java.io.Serializable;

public class CompanyItem implements Serializable {

    private String cName,cLogo;

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcLogo() {
        return cLogo;
    }

    public void setcLogo(String cLogo) {
        this.cLogo = cLogo;
    }

    public CompanyItem() {
    }

    public CompanyItem(String cName, String cLogo) {
        this.cName = cName;
        this.cLogo = cLogo;
    }
}
