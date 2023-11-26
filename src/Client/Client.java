package Client;

import java.net.InetAddress;

class Client{

    private InetAddress destAdress;
    private Integer portNumber;

    Client(InetAddress destAddress, Integer portNumber){
       this.destAdress = destAddress;
        this.portNumber = portNumber;
    }

    public InetAddress getDestAdress() {
        return destAdress;
    }

    public void setDestAdress(InetAddress destAdress) {
        this.destAdress = destAdress;
    }

    public Integer getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(Integer portNumber) {
        this.portNumber = portNumber;
    }

    

}