package nl.topicus.rest;

import javax.ejb.Stateless;
import javax.ws.rs.core.Response;

import nl.topicus.rest.model.Address;

@Stateless
public class AddressResourceRESTService extends AbstractCrudRestService<Address>
{
	public AddressResourceRESTService()
	{
		super(Address.class);
	}
	
	@Override
	public Response create(Address entity) {
		return super.create(entity);
	}
}
