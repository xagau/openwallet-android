package com.openwallet.core.coins;


import com.openwallet.core.coins.families.PeerFamily;
import com.openwallet.core.coins.families.BitFamily;

/**
 * @author Sean Beecroft
 */
public class PlaceholderMain extends BitFamily {
    private PlaceholderMain() {
        id = "placeh.main";

        addressHeader = 35;
        p2shHeader = 38;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 176; //0xB0;

        name = "Placeh";
        symbol = "PHL";
        uriScheme = "placeh";
        bip44Index = 1200;
        unitExponent = 8;
        feeValue = value(10000); // 0.0001 PHL
        minNonDust = value(1);
        softDustLimit = value(1000000); // 0.000001 PHL
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("placeh Signed Message:\n");
    }

    private static PlaceholderMain instance = new PlaceholderMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
