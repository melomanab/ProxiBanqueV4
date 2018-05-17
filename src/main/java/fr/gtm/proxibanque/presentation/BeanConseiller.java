package fr.gtm.proxibanque.presentation;

import java.io.IOException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.gtm.proxibanque.domaine.ClientProxi;
import fr.gtm.proxibanque.service.ClientService;

/**
 * Ce bean permet de récupérer les attributs d'un objet conseiller, notament
 * lors de l'affichage des clients propre au conseiller et lors de la
 * vérification du login
 * 
 * @author melomanab
 *
 */

@ManagedBean(name = "beanconseiller")
@SessionScoped
public class BeanConseiller {
	private ClientService serviceClient = new ClientService();
	
	ClientProxi clientProxi = new ClientProxi();

	public BeanConseiller() {
		super();
	}

	public ClientProxi getClient() {
		return clientProxi;
	}

	/**
	 * @return
	 */
	public List<ClientProxi> afficherListeClients() {
		List<ClientProxi> listeClients = serviceClient.getAllClients();
		
		return listeClients;
	}
}
