const express = require('express');
const bodyParser = require('body-parser');
const userRouter = require('./user.routes');



const app = express();
const PORT = 3000;


app.use(bodyParser.json());

app.use('/api', userRouter);

app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});

const Eureka = require('eureka-js-client').Eureka;

const eureka = new Eureka({
  instance: {
    app: 'USERSERVICE',
    hostName: 'localhost',
    ipAddr: '127.0.0.1',
    statusPageUrl: 'http://localhost:3000/actuator/health',
    port: {
      '$': 3000,
      '@enabled': 'true',
    },
    vipAddress: 'USERSERVICE',
    dataCenterInfo: {
      '@class': 'com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo',
      name: 'MyOwn',
    }
  },
  eureka: {
    host: 'localhost',
    port: 8761,
    servicePath: '/eureka/apps/'
  }
});
eureka.logger.level('debug');
eureka.start(function(error){
  console.log(error || 'complete');
});