package nl.topicus.rest;

import javax.ejb.Stateless;

import nl.topicus.rest.model.Address;

@Stateless
public class AddressResourceRESTService extends AbstractCrudRestService<Address>
{
	public AddressResourceRESTService()
	{
		super(Address.class);
	}
}
