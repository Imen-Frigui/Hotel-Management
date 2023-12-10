const mongoose = require('mongoose');

mongoose.connect('mongodb+srv://user123:123@cluster0.hqqsk.mongodb.net/?retryWrites=true&w=majority',);

const db = mongoose.connection;

db.on('error', console.error.bind(console, 'MongoDB connection error:'));
db.once('open', () => {
  console.log('Connected to MongoDB');
});

module.exports = mongoose;


