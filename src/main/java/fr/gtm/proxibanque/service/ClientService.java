package fr.gtm.proxibanque.service;

import java.io.IOException;
import java.util.List;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import fr.gtm.proxibanque.domaine.ClientProxi;

public class ClientService {

	private ObjectMapper mapper = new ObjectMapper();
	Client client = Client.create();
	String retour = null;

	public ClientProxi getClient() {
		ClientProxi clientProxi = null;
		
		WebResource webResource = client.resource("http://localhost:8080/webservice_1.0/api/clientProxi/client/1");
		ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

		retour = response.getEntity(String.class);
		System.out.println(retour);
		try {
			clientProxi = mapper.readValue(retour, ClientProxi.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clientProxi;

	}

	public List<ClientProxi> getAllClients() {
		List<ClientProxi> listeClients = null;
	
		WebResource webResource = client.resource("http://localhost:8080/webservice_1.0/api/clientProxi/");
		ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

		retour = response.getEntity(String.class);
		System.out.println(retour);
		try {
			listeClients = mapper.readValue(retour, new TypeReference<List<ClientProxi>>(){});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeClients;

	}

}
