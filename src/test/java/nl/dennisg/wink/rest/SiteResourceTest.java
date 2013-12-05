package nl.dennisg.wink.rest;
import javax.ws.rs.core.Response;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;


public class SiteResourceTest {

	private SiteResource resource;
	
	@Before
	public void setUp() throws Exception {
		resource = new SiteResource();
	}

	@Test
	public void test() {
		Response response = resource.index();
		Assert.assertEquals("SITE", response.getEntity().toString());
	}

}
