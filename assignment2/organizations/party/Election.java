package assignment2.organizations.party;

public class Election {
    private int votersNumber;

    private boolean fair;

    private String description;

    // constructor
    public Election(int votersNumber, boolean fair, String description){
        this.votersNumber = votersNumber;
        this.fair = fair;
        this.description = description;
    }

    // getters and setters for the implemented variables
    public int getVotersNumber(){
        return votersNumber;
    }

    public boolean getFair(){
        return fair;
    }

    public String getDescription(){
        return description;
    }

    public void setVotersNumber(int votersNumber){
        this.votersNumber = votersNumber;
    }

    public void setFair(boolean fair){
        this.fair = fair;
    }

    public void setDescription(String description){
        this.description = description;
    }

    // equality implementation for reference variables
    public boolean equals(Object compared) {
        // check if the object being compared is the same instance
        if (compared == this) {
            return true;
        }
        // check if the object being compared is an instance of Election
        if (!(compared instanceof Election)) {
            return false;
        }
        Election e = (Election) compared;
        // compare the attributes of the two Election objects
        return this.votersNumber == e.votersNumber && (this.fair == e.fair) && (this.description.equals(e.description));
    }

    @Override
    public String toString() {
        return "Number of voters: " + this.votersNumber + "; Fairness: " + this.fair + "; Description: " + this.description + ".";
    }
}
