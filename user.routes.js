const express = require('express');
const router = express.Router();
const UserController = require('./controller');
const keycloak = require('./keycloak');

router.get('/users', keycloak.protect(), (req, res) => {
  const redirectUri = determineRedirectUri(req);

  req.kauth.redirectUri = redirectUri;

  UserController.getAllUsers(req, res);
});

router.get('/users/:id', keycloak.protect(), (req, res) => {
  const redirectUri = determineRedirectUri(req);

  req.kauth.redirectUri = redirectUri;

  UserController.getUserById(req, res);
});

router.post('/users/create', keycloak.protect(), (req, res) => {
  const redirectUri = determineRedirectUri(req);

  req.kauth.redirectUri = redirectUri;

  UserController.createUser(req, res);
});

router.put('/users/:id', keycloak.protect(), (req, res) => {
  const redirectUri = determineRedirectUri(req);

  req.kauth.redirectUri = redirectUri;

  UserController.updateUser(req, res);
});

router.delete('/users/:id', keycloak.protect(), (req, res) => {
  const redirectUri = determineRedirectUri(req);

  req.kauth.redirectUri = redirectUri;

  UserController.deleteUser(req, res);
});

function determineRedirectUri(req) {
  return 'http://localhost:8080/realms/hotel-management-realm/protocol/openid-connect/auth';
}

module.exports = router;

/*const express = require('express');
const router = express.Router();
const UserController = require('./controller');
const keycloak = require('./keycloak');

router.get('/users',keycloak.protect(), UserController.getAllUsers);
router.get('/users/:id', UserController.getUserById);
router.post('/users', UserController.createUser);
router.put('/users/:id', UserController.updateUser);
router.delete('/users/:id', UserController.deleteUser);

module.exports = router;

*/