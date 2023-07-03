public class LandTransportDispatcher {

    private LandTransport[] transports;

    public LandTransportDispatcher(LandTransport[] transports) {
        this.transports = transports;
    }

    public void sayAllGo() {
        for (int i = 0; i < transports.length; i++) {
            transports[i].go();
        }
    }

    public void sayAllStop() {
        for (int i = 0; i < transports.length; i++) {
            transports[i].stop();
        }
    }
}