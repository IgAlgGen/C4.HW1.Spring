package Driver;

import Transport.Transport;

public class Driver {
    private Transport transport;

    public Driver( Transport transport) {
        this.transport = transport;
    }

    public Transport getTransport() {
        return transport;
    }
}
