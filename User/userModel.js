const mongoose = require('./db');

const userSchema = new mongoose.Schema({
  username: { type: String },
  password: { type: String },
  firstName: { type: String },
  lastName: { type: String },
  email: { type: String, required: true, unique: true },
  role: {
    type: String,
    enum: ['ADMIN', 'CUSTOMER', 'EMPLOYEE'],
    default: 'CUSTOMER',
  },

});

const User = mongoose.model('User', userSchema);

module.exports = User;
