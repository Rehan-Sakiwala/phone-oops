public class Landline implements phone{

    private String myPhoneNumber;
    private boolean isRinging;
    private boolean isPowerOn;

    public Landline(String myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
        this.isRinging=false;
        this.isPowerOn=true;
    }

    public String getMyPhoneNumber() {
        return myPhoneNumber;
    }

    public void setMyPhoneNumber(String myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn=true;
    }

    @Override
    public void makeCall(String myPhoneNumber) {
        if(isPowerOn==true){
            System.out.println("Dialing..........");
        }
        else{
            System.out.println("Your landline is off!!!");
        }
        return;
    }

    @Override
    public void receiveCall(String incomingNumber) {
        if(isPowerOn==true && myPhoneNumber.equals(incomingNumber)){
            this.isRinging=true;
            System.out.println("Please pick up the call........");
        }
        else{
            System.out.println("Your landline is off");
        }
    }

    @Override
    public boolean answerCall() {
        if(isRinging==true){
            System.out.println("Call answered");
            this.isRinging=false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
