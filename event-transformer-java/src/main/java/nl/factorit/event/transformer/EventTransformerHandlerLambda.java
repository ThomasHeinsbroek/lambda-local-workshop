package nl.factorit.event.transformer;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import javax.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class EventTransformerHandlerLambda implements RequestHandler<Object, String> {

    @Override
    public String handleRequest(Object event, Context context) {
        //The JSON object is parsed by Java to a LinkedHashMap
        System.out.println(event);

        String coolVariable = System.getenv("cool");

        return null;
    }
}
