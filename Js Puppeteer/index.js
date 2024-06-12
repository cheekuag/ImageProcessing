const grpc = require('@grpc/grpc-js');
const protoLoader = require('@grpc/proto-loader');
const path = require('path');
const {initializePages, recieveLayers}=require('./recieveGrpcRequest.js')

const PROTO_PATH = path.resolve(__dirname, '/Users/adityaagrawal/Desktop/ImageProcessing/Image(Java)/src/main/proto/imageSchema.proto');
var packageDefinition = protoLoader.loadSync(
    PROTO_PATH,
    {
        keepCase: true,
     longs: String,
     enums: String,
     defaults: true,
     oneofs: true
    });
    
const fileProto = grpc.loadPackageDefinition(packageDefinition).com;

const server = new grpc.Server();

initializePages()
server.addService(fileProto.RecieveLayers.service, { recieveLayers });
const port = '127.0.0.1:3000';
server.bindAsync(port, grpc.ServerCredentials.createInsecure(), (error, port) => {
    
    if (error) {
        console.error(`Server failed to bind: ${error.message}`);
        return;
    }
    console.log(`Server running at ${port}`);
    
});