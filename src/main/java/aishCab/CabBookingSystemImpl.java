package aishCab;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class CabBookingSystemImpl implements ICabBookingSystem {

    private Set<Cab> availableCabs = new HashSet<Cab>();

    public void addCab(Cab cab) {
        availableCabs.add(cab);
    }

    public String requestForCab(CabRequest request) throws CabNotAvailableException {

        Cab selectedCab = null;
        double maxProfit = 0;
        for (Cab cab : availableCabs) {
            if (cab.gotTimeToServeThis(request)) {
                double profit = cab.getProfit(request);
                if (profit > 20 && profit > maxProfit) {
                    selectedCab = cab;
                    maxProfit = profit;
                }
            }
        }

        if (selectedCab != null) {
            selectedCab.addJourney(request);
            return selectedCab.getId();
        } else {
            throw new CabNotAvailableException("No Cab Available");
        }
    }
    public int getNumofCabsRunning() {
        return availableCabs.size();
    }

}
