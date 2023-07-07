package toto;


import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Ticket {
    private List<Article> articles;
    private String modePaiement; 
    
    public void setModePaiement(String modePaiement) {
		this.modePaiement = modePaiement;
	}
    	
    public Ticket() {
        articles = new ArrayList<>();
    }

    public void addArticle(Article article) {
        articles.add(article);
    }

    public void genererTicket() {
        double totalPrix = 0;
        double tva = 0;
        Date date = new Date();
        DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
        System.out.println("\n\n                     SNACK MOUNIR                    ");
        System.out.println("            151 Rue des Postes, 59000 Lille          ");
        System.out.println("                   TEL : 09 80 91 36 05                ");
        System.out.println("                   https://snackmounir.fr/                \n\n");
        System.out.println(shortDateFormat.format(date));
        System.out.println("================== TICKET DE CAISSE ==================\n");
        System.out.println("Libéllé\t\tQuantité\tP U\t\tTotal\n");

        for (Article article : articles) {
            System.out.printf("%s\t\t%d\t\t%.2f%s\t\t%.2f%s%n", 
            		article.getPlat(), 
            		article.getQuantity(),
            		article.getPrixUnitaire(), " €", 
            		article.getTotal(), " €"
            		);
            		totalPrix += article.getTotal();
            		tva = totalPrix * 0.055;
        }

        				System.out.println("\n======================================================\n");
        System.out.printf("\t\t\t\tPaiement : \t%s\n", modePaiement);
        System.out.printf("\t\t\t\tT.V.A : \t%.2f%s%n", tva, " €");
        System.out.printf("\t\t\t\tTotal : \t%.2f%s%n", totalPrix, " €");
    }


	
}