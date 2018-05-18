package fr.gtm.proxibanque.presentation;

import java.util.List;

import fr.gtm.proxibanque.domaine.ClientProxi;
import fr.gtm.proxibanque.service.ClientService;

public class ClientLanceur {

	public static void main(String[] args) {
		ClientService service = new ClientService();

		ClientProxi nouveauClient = new ClientProxi(3,"test_add","test_add","test_add","test_add");
		nouveauClient.setIdConseiller(2);
		service.createClient(nouveauClient);
		
		
		 List<ClientProxi> listeClients = service.getAllClients(); 
		 for (ClientProxi client : listeClients) { 
			 System.out.println(client); 
		}


		ClientProxi client = service.getClient();
		System.out.println(client);

		// service.deleteClient(1);
		// System.out.println(service.getClient(1));
		// ClientDomaine client = new ClientDomaine("Patate", "Robert");
		//
		// service.createClient(client);
		// System.out.println(service.getAllClient());

		/*
		 * ClientDomaine client; client=service.getClient(1);
		 * System.out.println(client); client.setPrenom("James");
		 * System.out.println(service.modifierClient(client).getPrenom());
		 */

	}

}
