package ClientSide;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

class Client{

    private InetAddress IP;
    private Integer portNumber;
    private Socket clienSocket;

    Client(InetAddress IP, Integer portNumber) throws Exception{
       this.IP = IP;
        this.portNumber = portNumber;
        this.clienSocket = new Socket();
        this.clienSocket.connect(new InetSocketAddress(this.IP, this.portNumber), 1000);
        
    }

    public InetAddress getIP() {
        return this.IP;
    }

    public void setDestAdress(InetAddress IP) {
        this.IP = IP;
    }

    public Integer getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(Integer portNumber) {
        this.portNumber = portNumber;
    }

    public void sendMessage(String message){
        System.out.println(message);
    }
    

}