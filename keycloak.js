const Keycloak = require('keycloak-connect');

const keycloak = new Keycloak({
  store: {},
  clientId: '1',
  bearerOnly: true,
  serverUrl: 'http://localhost:8080/',
  realm: 'hotel-management-realm',
});

module.exports = keycloak;
