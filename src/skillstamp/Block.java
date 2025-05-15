package skillstamp;

import java.util.Date;

public class Block {
    public String hash;
    public String previousHash;
    private String data;
    private long timeStamp;

    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }

    public String calculateHash() {
        String input = previousHash + Long.toString(timeStamp) + data;
        return StringUtil.applySha256(input);
    }

    // Getter for 'data' field (to access private 'data' from outside the Block class)
    public String getData() {
        return data;
    }
}
