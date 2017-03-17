Request req = socket.getRequest();
if(req.type() == read){
	while (!req.getVersion() < board.getVersion());	
	socket.respond (board.allMessages());
}
else if (req.type() == write)
 	board.addMessage(req.getMessage());
