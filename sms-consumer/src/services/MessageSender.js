const { messageCreator } = require("../component/MessageCreator.js");
const send = (msg) => {
  //Enviar mensagem
  //Converter a mensagem para object
  const consumerMessage = JSON.parse(msg);
  const message = messageCreator(consumerMessage);
  console.log(message);
};

module.exports = { send };
