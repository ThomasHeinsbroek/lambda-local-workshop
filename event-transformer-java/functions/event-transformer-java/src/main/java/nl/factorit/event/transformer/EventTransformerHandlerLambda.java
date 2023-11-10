package nl.factorit.event.transformer;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.services.sqs.model.SendMessageRequest;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.stream.IntStream;

@ApplicationScoped
public class EventTransformerHandlerLambda implements RequestHandler<Object, String> {

    @Override
    public String handleRequest(Object event, Context context) {
        System.out.println("test 123!");

        return null;
    }
}
