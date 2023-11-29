package ServerSide;

class Server{

    public String serverName;

    Server(){
        this.serverName = "testing server";
    }

    @Override
    public String toString(){
        return this.serverName;
    }
    
}