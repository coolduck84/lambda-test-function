package com.pc.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pc.lambda.model.JsonRequest;

public class Handler implements RequestHandler<JsonRequest, JsonRequest> {

	private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

	public JsonRequest handleRequest(JsonRequest event, Context context) {
		
		LambdaLogger logger = context.getLogger();

		logger.log("event => " + gson.toJson(event) + "\n");
		//logger.log("event.class => " + event.getClass().toString());
		logger.log("context => " + gson.toJson(context) + "\n");
		
		JsonRequest response = new JsonRequest();
		response.setEmpDetails(event.getEmpDetails());
		response.setFirstName(event.getFirstName());
		response.setLastName(event.getLastName());
		response.setProceedFurther(event.isProceedFurther());
		return response;
	}
}
