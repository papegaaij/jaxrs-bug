package nl.topicus.rest;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

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
	
	@Override
	public Response create(Identity entity) {
		return super.create(entity);
	}

	@Path("address")
	public AddressResourceRESTService address() {
		return addressResource;
	}
}
