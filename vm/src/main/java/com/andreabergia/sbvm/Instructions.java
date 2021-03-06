package com.andreabergia.sbvm;

public class Instructions {
    public static final int HALT = 0x01;
    public static final int PUSH = 0x02;
    public static final int ADD = 0x03;
    public static final int SUB = 0x04;
    public static final int MUL = 0x05;
    public static final int DIV = 0x06;
    public static final int NOT = 0x07;
    public static final int AND = 0x08;
    public static final int OR = 0x09;
    public static final int POP = 0x0A;
    public static final int DUP = 0x0B;
    public static final int ISEQ = 0x0C;
    public static final int ISGE = 0x0D;
    public static final int ISGT = 0x0E;
    public static final int JMP = 0x0F;
    public static final int JIF = 0x10;
    public static final int LOAD = 0x11;
    public static final int STORE = 0x12;
    public static final int CALL = 0x13;
    public static final int RET = 0x15;
}
