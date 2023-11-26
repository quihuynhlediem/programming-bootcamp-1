package RMITAssessment2.Task3;

public abstract class Seat {

    /**
     * DECLARE YOUR ATTRIBUTES HERE.
     */
    private String seatRow;
    private int seatNum;
    private String seatPosition;
    private String seatMaterial;
    private boolean isBooked = false;

    /** CONSTRUCTORS */
    public Seat() {
        seatRow = "";
        seatNum = 0;
        seatPosition = "";
        seatMaterial = "";
    }

    public Seat(String row, int number, String material, String position) {

        seatRow = row;
        seatNum = number;
        seatPosition = position;
        seatMaterial = material;
    }

    public String getRow(){
        String outputSeatRow = "";
        if (!Character.isLetter(seatRow.charAt(0))){
            outputSeatRow = "ERROR";
        }
        else {
            outputSeatRow = seatRow.toUpperCase();
        }
        return outputSeatRow;
    }
    public String getNumber(){
        String outputNum = "";
        if (seatNum > 0 && seatNum < 10){
            outputNum = "0" + seatNum;
        }
        else if (seatNum <= 32 && seatNum >= 10){
            outputNum = "" + seatNum;
        }
        else {
            outputNum =  "-1";
        }
        return outputNum;
    }

    public String getSeatIdentifier(){
        return getRow() + getNumber();
    }

    public boolean isBooked(){
        return isBooked;
    }

    public boolean bookSeat(){
        if (isBooked){
            return false;
        }
        isBooked = true;
        return true;
    }

    public boolean cancelBooking(){
        if (isBooked){
            isBooked = false;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean equals(Seat other){
        boolean checkSeatRow = this.seatRow.equals(other.seatRow);
        boolean checkSeatNum = this.seatNum == other.seatNum;
        boolean checkSeatPosition = this.seatPosition.equals(other.seatPosition);
        boolean checkSeatMaterial = this.seatMaterial.equals(other.seatMaterial);
        if (checkSeatRow && checkSeatNum && checkSeatPosition && checkSeatMaterial){
            return true;
        }
        else {
            return false;
        }
    }

    public String getSeatMaterial() {
        return seatMaterial;
    }

    public String getSeatPosition() {
        return seatPosition;
    }

    public String toString(){
        String seatPrint = getSeatIdentifier() + ":" + getSeatMaterial() + ":" +  getSeatPosition() + ":" + isBooked();
        return seatPrint;
    }


}
