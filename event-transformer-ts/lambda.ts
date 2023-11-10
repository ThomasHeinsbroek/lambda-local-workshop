import { Handler } from 'aws-lambda';
import { DynamoDB } from 'aws-sdk';

const dynamo = new DynamoDB.DocumentClient();
const TABLE_NAME : string = process.env.HELLO_TABLE_NAME!;

export const handler: Handler = async (event, context) => {
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