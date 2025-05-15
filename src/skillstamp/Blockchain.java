package skillstamp;

import java.util.ArrayList;
import java.util.List;

public class Blockchain {
    private List<Block> chain;

    public Blockchain() {
        chain = new ArrayList<>();
        // Genesis block
        chain.add(new Block("Genesis Block", "0"));
    }

    public void addCertificate(Certificate certificate) {
        Block previousBlock = chain.get(chain.size() - 1);
        Block newBlock = new Block(certificate.toString(), previousBlock.hash);
        chain.add(newBlock);
    }

    public void displayChain() {
        for (Block block : chain) {
            System.out.println("Hash: " + block.hash);
            System.out.println("Previous Hash: " + block.previousHash);
            System.out.println("Data: " + block.getData());  // Use the getter method here
            System.out.println("--------------");
        }
    }
}
