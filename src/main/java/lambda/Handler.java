package lambda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Handler implements RequestHandler<String, String> {

	private static final Logger logger = LoggerFactory.getLogger(Handler.class);
	private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

	public Handler() {
	}

	public String handleRequest(String event, Context context) {
		logger.info("event => ", gson.toJson(event));
		logger.info("context => ", gson.toJson(context));
		// String response = input;
		return "";
	}
}
