const grpc = require('@grpc/grpc-js');
const protoLoader = require('@grpc/proto-loader');
const path = require('path');
const { initializePages, recieveLayers } = require('./Service/recieveGrpcRequest.js');

// Define the path to the .proto file
const PROTO_PATH = path.resolve(__dirname, '/Users/adityaagrawal/Desktop/ImageProcessing/Image(Java)/src/main/proto/imageSchema.proto');

// Loading the .proto file
var packageDefinition = protoLoader.loadSync(
    PROTO_PATH,
    {
        keepCase: true,  
        longs: String,   
        enums: String,   
        defaults: true,  
        oneofs: true     
    }
);

// Load the gRPC object
const fileProto = grpc.loadPackageDefinition(packageDefinition).com;

// Create a new gRPC server instance
const server = new grpc.Server();

// Initialize (Browser and newPages in browser) in recieveGrpcRequest
initializePages();

// Add the RecieveLayers service to the server i.e recieveLayers
server.addService(fileProto.RecieveLayers.service, { recieveLayers });

// Define the server port
const port = '127.0.0.1:3000';

server.bindAsync(port, grpc.ServerCredentials.createInsecure(), (error, port) => {
    if (error) {
        console.error(`Server failed to bind: ${error.message}`);
        return;
    }
    console.log(`Server running at ${port}`);
});
