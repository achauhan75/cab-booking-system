package aishCab;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CabRequestApplication {

    public static void main(String[] args) throws CabNotAvailableException {
        String bookingId = "1";
        int pickupCode = 2;
        int dropCode = 400;
        Date pickupTime = Date.from(Instant.now());

        CabRequest cabRequest = new CabRequest(bookingId, pickupCode, dropCode, pickupTime);
        
        List<CabRequest> cabRequestList = new ArrayList<CabRequest>();
        cabRequestList.add(cabRequest);
        Cab cab = new Cab("1", 2);
        ICabBookingSystem cabBookingSystem = new CabBookingSystemImpl();
        cabBookingSystem.addCab(cab);
        cabBookingSystem.getNumofCabsRunning();
        System.out.println(cabBookingSystem.requestForCab(cabRequest));
    }
}
