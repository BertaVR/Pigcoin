package edu.pingpong.pigcoin;

public class TransactionTest {
    Wallet wallet_1 = new Wallet();
    Wallet wallet_2 = new Wallet();

    Transaction trx = new Transaction("hash_1", "0", wallet_1.getAddress(), wallet_2.getAddress(), 20.0, "a flying pig!");

}
