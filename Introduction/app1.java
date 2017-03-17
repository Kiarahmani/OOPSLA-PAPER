Request req = socket.getRequest();
if(req.type() == read)
	socket.respond (board.allMessages());
else if (req.type() == write)
 	board.addMessage(req.getMessage());
