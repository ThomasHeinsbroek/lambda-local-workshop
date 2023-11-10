## lambda-local-workshop
Repository for a workshop about locally developing with AWS Lambda's

### Setup
To use the AWS toolkit for local development, Docker has to be installed and running on the PC.
You will also need a IDE for Typescript and Java which can use the AWS toolkit plugin.

### To run the Typescript lambda
After completing the setup, run ``npm install`` in the event-transformer-ts directory
You can then right-click the handler in lambda.ts to run it.

### To run the Java lambda
Add the pom.xml file in the event-transformer-java directory as a Maven project and let the dependencies resolve.
Then you can run the request handler in the EventTransformerHandlerLambda file with AWS toolkit.