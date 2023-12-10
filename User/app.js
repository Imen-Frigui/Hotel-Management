const express = require('express');
const bodyParser = require('body-parser');
const userRouter = require('./user.routes');
const session = require('express-session');


const app = express();
const PORT = 3000;

app.use(bodyParser.json());

app.use('/api', userRouter);

app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});
