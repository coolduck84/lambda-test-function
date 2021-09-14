package lambda;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Handler implements RequestHandler<Map<String, String>, String> {

	private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

	public Handler() {
	}

	public String handleRequest(Map<String, String> event, Context context) {
		
		LambdaLogger logger = context.getLogger();

		logger.log("event => " + gson.toJson(event));
		logger.log("context => " + gson.toJson(context));
		
		// String response = input;
		return "";
	}
}
