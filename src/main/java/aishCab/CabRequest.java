package aishCab;

import java.util.Date;

/**
 * CabRequest
 */
public class CabRequest {

    private final String bookingId;
    private final int pickupCode;
    private final int dropCode;
    private final Date pickupTime;


    public CabRequest(String bookingId, int pickupCode, int dropCode, Date pickupTime) {
        this.bookingId = bookingId;
        this.pickupCode = pickupCode;
        this.dropCode = dropCode;
        this.pickupTime = pickupTime;
    }

    public String getBookingId() {
        return bookingId;
    }

    public int getPickupCode() {
        return pickupCode;
    }

    public int getDropCode() {
        return dropCode;
    }

    public Date getPickupTime() {
        return (Date) pickupTime.clone();
    }
}
