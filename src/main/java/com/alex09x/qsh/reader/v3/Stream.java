package com.alex09x.qsh.reader.v3;

import com.alex09x.qsh.reader.Utils;

import java.io.DataInput;
import java.io.IOException;
import java.sql.Timestamp;

/**
 * Created by alex on 12.01.14.
 */
public abstract class Stream<T> {
    protected final DataInput dataInput;
    protected final String symbol;
    protected final int stepPrice;
    protected final int[] basePrice = new int[1];

    public Stream(DataInput dataInput) throws IOException {
        this.dataInput = dataInput;
        String data = Utils.readString(dataInput);
        String[] split = data.split(":");
        this.symbol = split[1];
        this.stepPrice = Integer.valueOf(split[4]);
        System.out.printf("Instrument = %s%n", symbol);
    }

    public abstract T read(Timestamp currentDateTime) throws IOException;
}
