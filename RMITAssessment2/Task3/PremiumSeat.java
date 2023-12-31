package RMITAssessment2.Task3;

public class PremiumSeat extends Seat {
    private boolean hasPillow = true;
    private boolean hasLegRest = super.getRow().equals("A");
    public PremiumSeat(String row, int number, String position){
        super(row, number, "Leather", position);
    }

    public boolean getHasPillow(){
        return hasPillow;
    }

    public boolean getHasLegRest(){
        return hasLegRest;
    }

    @Override
    public String toString(){
        String seatPrint = super.toString() + ":" + getHasPillow() + ":" + getHasLegRest();
        return seatPrint;
    }
}
