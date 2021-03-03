package edu.pingpong.pigcoin.domain;

import java.security.PublicKey;

public class Transaction {
    private String hash = "";
    private String prev_hash = "";
    private PublicKey pKey_sender;
    private PublicKey pKey_recipient;
    private byte[] signature;
    private double pigcoins = 0d;
    private String message = "";


    public Transaction(String hash_1, String s, PublicKey address, PublicKey wallet_2Address, double v, String s1) {

    }


    public Transaction(String hash, String prev_hash, PublicKey pKey_sender, PublicKey pKey_recipient, double pigcoins, String message, byte[] signature) {
        this.hash = hash;
        this.prev_hash = prev_hash;
        this.pKey_sender = pKey_sender;
        this.pKey_recipient = pKey_recipient;
        this.pigcoins = pigcoins;
        this.message = message;
    }

    public String getHash() {
        return this.hash;
    }

    public String getPrev_hash() {
        return this.prev_hash;
    }

    public PublicKey getpKey_sender() {
        return this.pKey_sender;
    }

    public PublicKey getpKey_recipient() {
        return this.pKey_recipient;
    }

    public double getPigcoins() {
        return this.pigcoins;
    }

    public void setPigcoins(double pigcoins) {
        this.pigcoins = pigcoins;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public byte[] getSignature() {
        return this.signature;
    }

    public void setSignature(byte[] signature){
        this.signature = signature;
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
