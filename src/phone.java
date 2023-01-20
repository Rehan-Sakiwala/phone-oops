public interface phone {
    void powerOn();
    void makeCall(String phoneNumber);
    void receiveCall(String incomingNumber);
    boolean  answerCall();
    boolean isRinging();
}
