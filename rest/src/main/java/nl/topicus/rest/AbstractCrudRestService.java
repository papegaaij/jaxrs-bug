package nl.topicus.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
public abstract class AbstractCrudRestService<WS> {
	@Context
	private UriInfo uriInfo;

	private Class<WS> wsClass;

	public AbstractCrudRestService(Class<WS> wsClass) {
		this.wsClass = wsClass;
	}

	protected UriInfo getUriInfo() {
		return uriInfo;
	}

	protected Class<WS> getWsClass() {
		return wsClass;
	}

	@GET
	public Response get() {
		return Response.ok().build();
	}

	@POST
	public Response create(WS entity) {
		System.out.println("creating " + entity + " of type "
				+ entity.getClass().getName());
		return Response.created(uriInfo.getAbsolutePathBuilder().build()).build();
	}
}
