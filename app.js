const express = require('express');
const bodyParser = require('body-parser');
const userRouter = require('./user.routes');
const session = require('express-session');
//const keycloak = require('./keycloak'); 
const Keycloak = require('keycloak-connect');

const app = express();
const PORT = 3000;

app.use(bodyParser.json());
app.use(
  session({
    secret: 'admin',
    resave: true,
    saveUninitialized: true,
  })
);

const keycloak = new Keycloak({
  store: {}, 
  clientId: '1',
  bearerOnly: true,
  serverUrl: 'http://localhost:8080/',
  realm: 'hotel-management-realm/',
});

app.use(keycloak.middleware());

app.use('/api', userRouter);

app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});
