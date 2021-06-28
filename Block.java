import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

//a block stores its own hash, previous nodes hash,
//timestamp of creation, data, and a arbitary number used for cryptoraphy
public class Block
{
  private static Logger logger = Logger.getLogger(Block.class.getName());

  private String hash;
  private String previoushash;
  private String data;
  private long timestamp;
  private int nonce;

  public Block(String data, String previoushash, long timestamp)
  {
    this.data = data;
    this.previoushash = previoushash;
    this.timestamp = timestamp;
    this.hash = calculateBlockHash();
  }

  public String mineBlock(int prefix) 
  {
     String prefixString = new String(new char[prefix]).replace('\0', '0');
        while (!hash.substring(0, prefix)
            .equals(prefixString)) {
            nonce++;
            hash = calculateBlockHash();
        }
        return hash;   
  }

  public String calculateBlockHash()
  {
    String dataToHash = previoushash 
                        + Long.toString(timestamp) 
                        + Integer.toString(nonce) 
                        + data;
    MessageDigest digest = null;
    byte[] bytes = null;

    try{
      digest = MessageDigest.getInstance("SHA-256");
      bytes = digest.digest(dataToHash.getBytes("UTF_8"));
    }
    catch(NoSuchAlgorithmException | UnsupportedEncodingException ex)
    {
      logger.log(Level.SEVERE, ex.getMessage());
    }
    StringBuffer buffer = new StringBuffer();
    for (byte b : bytes)
    {
      buffer.append(String.format("%02x",b));
    }
    return buffer.toString();
  }
}

/*
public class Main
{
  public static void main(String[] args) {
    System.out.println("hello world");
  }
}
*/
