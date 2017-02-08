
package lol.veikko;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class Veikko {
	@Inject
	VeikkoService veikkoService;
	@GET
	@Path("/saa")
	@Produces(MediaType.APPLICATION_JSON)
	public Weather kerroSaa() {
		return veikkoService.saaPalvelu();
	}
	
	@GET
	@Path("/helloveikko")
	@Produces(MediaType.APPLICATION_JSON)
	public Hello helloVeikko() {
		return veikkoService.helloVeikko();
	}
	
	@GET
	@Path("/veikonvinkit")
	@Produces(MediaType.APPLICATION_JSON)
	public Vinkki kerroVinkki() {
		return veikkoService.vinkkiPalvelu();
	}

}
