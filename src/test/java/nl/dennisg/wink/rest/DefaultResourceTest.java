package nl.dennisg.wink.rest;
import javax.ws.rs.core.Response;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;


public class DefaultResourceTest {

	private DefaultResource resource;
	
	@Before
	public void setUp() throws Exception {
		resource = new DefaultResource();
	}

	@Test
	public void test() {
		Response response = resource.index();
		Assert.assertEquals("OK", response.getEntity().toString());
	}

}
