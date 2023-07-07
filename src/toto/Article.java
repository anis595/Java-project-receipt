package toto;

class Article {
    private String plat;
    private int quantite;
    private double prixUnitaire;

    public Article(String plat, int quantite, double prixUnitaire) {
        this.plat = plat;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
    }
    
    public double getTotal() {
        return quantite * prixUnitaire;
    }

    public String getPlat() {
        return plat;
    }

    public int getQuantity() {
        return quantite;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }
    
}



