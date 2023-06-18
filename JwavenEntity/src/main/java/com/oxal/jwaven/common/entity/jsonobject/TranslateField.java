package com.oxal.jwaven.common.entity.jsonobject;

public class TranslateField {
    private String fr;
    private String en;
    private String es;
    private String de;
    private String pt;

    public TranslateField() {
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    @Override
    public String toString() {
        return "TranslateField{" +
                "fr='" + fr + '\'' +
                ", en='" + en + '\'' +
                ", es='" + es + '\'' +
                ", de='" + de + '\'' +
                ", pt='" + pt + '\'' +
                '}';
    }
}
