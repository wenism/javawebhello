package wenism;

import junit.framework.Assert;
import org.junit.Test;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class TestJavaWebHello {

	@Test
	public void testSomething() {
		JavaWebHello app = new JavaWebHello();
        String response = app.getVelocityTemplateEngine().render(app.getModelAndView());
        Assert.assertTrue(response.contains("Hello Web App in Java"));
	}
}