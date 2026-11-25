package com.upskilling.w01;

public class TypeCastingLab {

    public int truncateToInt(double value) {
        return (int) value;
    }

    public byte castIntToByte(int value) {
        return (byte) value;
    }

    public boolean willByteOverflow(int value) {
        return value < Byte.MIN_VALUE || value > Byte.MAX_VALUE;
    }
}