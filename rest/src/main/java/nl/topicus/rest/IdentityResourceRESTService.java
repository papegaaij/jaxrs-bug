package nl.topicus.rest;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Path;

import nl.topicus.rest.model.Identity;

@Path("/identity")
@Stateless
public class IdentityResourceRESTService extends
		AbstractCrudRestService<Identity> {

	@EJB
	private AddressResourceRESTService addressResource;

	public IdentityResourceRESTService() {
		super(Identity.class);
	}
	
	@Path("address")
	public AddressResourceRESTService address() {
		return addressResource;
	}
}
