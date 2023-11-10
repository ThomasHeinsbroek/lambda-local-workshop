import { Handler } from 'aws-lambda';

export const handler: Handler = async (event, context) => {
    const logText = process.env.logText;

    console.log(logText);

    //This is an example Lambda which does things dependent on the given context of the event
    const method = event.requestContext.http.method;

    if (method === 'GET') {
        return 'Method was GET'
    } else if (method === 'POST') {
        return 'Method was POST'
    } else {
        return {
            statusCode: 400,
            body: 'Not a valid operation'
        };
    }
};