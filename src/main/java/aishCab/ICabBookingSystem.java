package aishCab;

/**
 *
 */
public interface ICabBookingSystem {

    void addCab(Cab cab);

    String requestForCab(CabRequest request) throws CabNotAvailableException;

    int getNumofCabsRunning();
}
