package com.openwallet.core.coins;

import com.openwallet.core.coins.families.PeerFamily;

/**
 * @author Sean Beecroft
 */
public class PlaceholderMain extends PeerFamily {
    private PlaceholderMain() {
        id = "plach.main";

        addressHeader = 35;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 0xB0;

        name = "Placeh";
        symbol = "PHL";
        uriScheme = "placeh";
        bip44Index = 10;
        unitExponent = 8;
        feeValue = value(10000); // 0.0001 BLK
        minNonDust = value(1);
        softDustLimit = value(1000000); // 0.01 BLK
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        signedMessageHeader = toBytes("BlackCoin Signed Message:\n");
    }

    private static PlaceholderMain instance = new PlaceholderMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
