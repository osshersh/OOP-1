package task1;

public class CinemaHallSeat {
    private final int seatNumber;
    private final int rowNumber;
    private boolean isFree;

    public CinemaHallSeat(int seatNumber, int rowNumber){
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.isFree = true;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
