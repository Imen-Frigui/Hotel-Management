const express = require('express');
const router = express.Router();
const UserController = require('./controller');

router.get('/users', UserController.getAllUsers);

router.get('/users/:id', UserController.getUserById);

router.post('/users/create', UserController.createUser);

router.put('/users/:id', UserController.updateUser);

router.delete('/users/:id', UserController.deleteUser);

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