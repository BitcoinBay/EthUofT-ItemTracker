package packageA;

import org.aion.avm.api.ABIDecoder;
import org.aion.avm.api.BlockchainRuntime;

public class HelloAvm
{



  static {
    contractAddress = BlockchainRuntime.getAddress();
    owner = BlockchainRuntime.getCaller();
    timestamp = BlockchainRuntime.getBlockTimestamp();
    blockNumber = BlockchainRuntime.getBlockNumber();
  }






    public static String storage1;

    public static void sayHello() {
        BlockchainRuntime.println("Hello Avm");
    }

    public static String greet(String name) {
        return "Hello " + name + "!";
    }

    public static void setString(String stringToStore) {
        storage1 = stringToStore;

    }

    public static String getString() {
        return storage1;
    }

    //main should be last function
    public static byte[] main() {
        return ABIDecoder.decodeAndRunWithClass(HelloAvm.class, BlockchainRuntime.getData());
    }
}
