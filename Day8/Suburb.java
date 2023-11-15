package Day8;

public class Suburb {
    private String name;
    private String city;
    private String postCode;
    State state;

    public Suburb(String _name, String _city, State _state, String _postCode){
        name = _name;
        city = _city;
        state = _state;
        postCode = _postCode;
    }

    private boolean titlecaseCheck(String str){
        int whitespaceIndex = str.indexOf(" ");
        while (whitespaceIndex > 0){
            boolean uppercaseCheck = (str.charAt(whitespaceIndex + 1) >= 'A') && (str.charAt(whitespaceIndex + 1) <= 'Z');
            if (!uppercaseCheck){
                return false;
            }
            whitespaceIndex = str.indexOf(" ", (whitespaceIndex + 1));
        }
        return true;
    }

    public String getName(){
        if (nameCheck()) {
            return name;
        }
        else {
            return "ERROR";
        }
    }

    private boolean nameCheck(){
        if ((name.length() < 1) || (name.length() > 26) || !titlecaseCheck(name)){
            return false;
        }
        return true;
    }

    public String getCity(){
        if (cityCheck()) {
            return city;
        }
        else {
            return "ERROR";
        }
    }

    private boolean cityCheck(){
        if ((city.length() < 1) || !titlecaseCheck(name)){
            return false;
        }
        return true;
    }

    public String getPostCode(){
        if (postCodeCheck()) {
            return postCode;
        }
        else {
            return "ERROR";
        }
    }

    private boolean postCodeCheck(){
        if (postCode.length() != 4){
            return false;
        } else {
            for (int i = 0; i < 4; ++i){
                if (!Character.isDigit(postCode.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }

    public String getState(){
        switch(state) {
            case NEW_SOUTH_WALES:
                return "New South Wales";
            case AUSTRALIAN_CAPITAL_TERRITORY:
                return "Australia Capital Territory";
            case QUEENSLAND:
                return "Queensland";
            case VICTORIA:
                return "Victoria";
            case SOUTH_AUSTRALIA:
                return "South Australia";
            case WESTERN_AUSTRALIA:
                return "Western Australia";
            case TASMANIA:
                return "Tasmania";
            case NORTHERN_TERRITORY:
                return "Northern Territory";
            default:
                return "ERROR";
        }

    }

    public String toString(){
        return getName() + ":" + getCity() + ":" + getState() + ":" + getPostCode();
    }

}
// Why toString() help print value instead of reference?

