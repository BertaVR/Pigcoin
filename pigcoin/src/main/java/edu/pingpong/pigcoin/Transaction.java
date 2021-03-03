package edu.pingpong.pigcoin;

import java.security.PublicKey;

public class Transaction {
    private final String hash;
    private final String prev_hash;
    private PublicKey pKey_sender;
    private PublicKey pKey_recipient;
    private final byte[] signature;
    private double pigcoins = 0d;
    private String message = "";


    public Transaction() {

    }


    public Transaction(String hash, String prev_hash, PublicKey pKey_sender, PublicKey pKey_recipient, double pigcoins, String message, byte[] signature) {
        this.hash = hash;
        this.prev_hash = prev_hash;
        this.pKey_sender = pKey_sender;
        this.pKey_recipient = pKey_recipient;
        this.pigcoins = pigcoins;
        this.message = message;
        this.signature = signature;
    }

    public String getHash() {
        return hash;
    }

    public String getPrev_hash() {
        return prev_hash;
    }

    public PublicKey getpKey_sender() {
        return pKey_sender;
    }

    public PublicKey getpKey_recipient() {
        return pKey_recipient;
    }

    public double getPigcoins() {
        return pigcoins;
    }

    public void setPigcoins(double pigcoins) {
        this.pigcoins = pigcoins;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public byte[] getSignature() {
        return signature;
    }

    @Override
    public String toString(){
        return "\nhash = " + getHash() +
                "\nprev_hash = " + getPrev_hash() +
                '\n' + getpKey_sender() +
                '\n' + getpKey_recipient() +
                '\n' + getPigcoins() +
                '\n' + getMessage() + '\n';
    }

}
