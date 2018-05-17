package fr.gtm.proxibanque.domaine;


/**
 * @author Stagiaire
 *
 */
public class ClientProxi {

	// Declaration des attributs caracterisant un objet de type Client
	private Integer idClient;
	private String nomClient;
	private String prenomClient;
	private String emailClient;
	private String adresseClient;
	private Integer idConseiller;
	

	// Constructeur par defaut et parametre

	public ClientProxi() {
		super();
		this.idClient = null;
		this.nomClient = "Entrez votre nom";
		this.prenomClient = "Entrez votre prenom";
		this.adresseClient = "Entrez votre adresse";
		this.emailClient = "Entrez votre email";
		this.idConseiller = null;
	}
	
	public ClientProxi(Integer idClient, String nomClient, String prenomClient, String emailClient,
			String adresseClient) {
		super();
		this.idClient = idClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.emailClient = emailClient;
		this.adresseClient = adresseClient;
		this.idConseiller = 1;
	}

	public Integer getIdClient() {
		return idClient;
	}


	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}


	public String getNomClient() {
		return nomClient;
	}


	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}


	public String getPrenomClient() {
		return prenomClient;
	}


	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}


	public String getEmailClient() {
		return emailClient;
	}


	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}


	public String getAdresseClient() {
		return adresseClient;
	}


	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}


	public Integer getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(Integer idConseiller) {
		this.idConseiller = idConseiller;
	}
	
	/* Redéfinition de la méthode toString()
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return this.nomClient + " " + this.prenomClient + " est le client " + this.getIdClient()
				+ " avec comme conseiller le conseiller " + this.idConseiller + " ";
	}
}
