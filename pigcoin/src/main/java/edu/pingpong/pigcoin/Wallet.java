package edu.pingpong.pigcoin;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public class Wallet {


    private PublicKey address;
    private PrivateKey sKey;
    private double total_input = 0d;
    private double total_output = 0d;
    private double balance = total_input - total_output;
    private Transaction[] inputTransactions;
    private Transaction[] outputTransactions;

    public Wallet() {
    };



    public Wallet(PublicKey address, PrivateKey sKey, double total_input, double total_output, double balance, Transaction[] inputTransactions, Transaction[] outputTransactions) {
        this.address = address;
        this.sKey = sKey;
        this.total_input = total_input;
        this.total_output = total_output;
        this.balance = balance;
        this.inputTransactions = inputTransactions;
        this.outputTransactions = outputTransactions;
    }


    public void setAddress(PublicKey address) {
        this.address = address;
    }

    public void setSK(PrivateKey sKey) {
        this.sKey = sKey;
    }

    public void generateKeyPair() {
        KeyPair pair = GenSig.generateKeyPair();
        this.setSK(pair.getPrivate());
        this.setAddress(pair.getPublic());
    }

    public PublicKey getAddress() {
        return address;
    }

    public PrivateKey getSK() {
        return sKey;
    }

    }



