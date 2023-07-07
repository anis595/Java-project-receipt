package toto;

public class Menu {
	
	private String plat; 
	private String accompagnement;
	private String boisson;
	private String supplement;
	
	public Menu(String plat, String accompagnement, String boisson, String supplement) {
		this.plat = plat;
		this.accompagnement = accompagnement;
		this.boisson = boisson;
		this.setSupplement(supplement);
		
	}
	public String getPlat() {
		return plat;
	}

	public void setPlat(String plat) {
		this.plat = plat;
	}

	public String getAccompagnement() {
		return accompagnement;
	}

	public void setAccompagnement(String accompagnement) {
		this.accompagnement = accompagnement;
	}

	public String getBoisson() {
		return boisson;
	}

	public void setBoisson(String boisson) {
		this.boisson = boisson;
	}
	public String getSupplement() {
		return supplement;
	}
	public void setSupplement(String supplement) {
		this.supplement = supplement;
	}
}