package com.example.jsonapijava.model;

public class DataALgoritma {
    String nameAlgoritma, baca_lebih_lanjut, description, logo;

    public DataALgoritma(String nameAlgoritma, String baca_lebih_lanjut, String description, String logo) {
        this.nameAlgoritma = nameAlgoritma;
        this.baca_lebih_lanjut = baca_lebih_lanjut;
        this.description = description;
        this.logo = logo;
    }

    public String getNameAlgoritma() {
        return nameAlgoritma;
    }

    public String getBaca_lebih_lanjut() {
        return baca_lebih_lanjut;
    }


    public String getDescription() {
        return description;
    }

    public String getLogo() {
        return logo;
    }
}
