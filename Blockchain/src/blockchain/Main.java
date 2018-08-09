package blockchain;

import java.util.Arrays;
public class Main {
     public static void main(String[] args) {

        String[] genesisTransactions = {"Welcome World of Warcraft"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2Transactions = {"Hello Welcome to Blockchain"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);


        System.out.println("Hash of genesis block:");
        System.out.println(genesisBlock.getBlockHash());

        System.out.println("Hash of block 2:");
        System.out.println(block2.getBlockHash());

    }
}
