package wenism;

import static spark.Spark.get;

import spark.ModelAndView;
import java.util.HashMap;
import java.util.Map;

import spark.template.velocity.VelocityTemplateEngine;

public class JavaWebHello {

    public static final String APP_VERSION = "@APP.VERSION@";
    public static final String BUILT_ON = "@BUILT.ON@";
    public static final String BUILT_USING = "@BUILT.USING@";
    private VelocityTemplateEngine engine = new VelocityTemplateEngine();
    
    public static void main(String[] args) {
        new JavaWebHello().run();
    }
    
    void run() {
        get("/", (req, res) -> { return getModelAndView(); }, engine);
    }
    
    VelocityTemplateEngine getVelocityTemplateEngine() {
        return engine;
    }

    ModelAndView getModelAndView() {
        Map<String, Object> model = new HashMap<>();
        model.put("ENVIRONMENT", System.getenv("ENVIRONMENT"));
        model.put("APP_VERSION", APP_VERSION);
        model.put("BUILT_ON", BUILT_ON);
        model.put("BUILT_USING", BUILT_USING);
        model.put("CONTAINER_ENGINE_VERSION", System.getenv("CONTAINER_ENGINE_VERSION"));
        model.put("OS", System.getenv("OS"));

        return new ModelAndView(model, "hello.vm");
    }
}