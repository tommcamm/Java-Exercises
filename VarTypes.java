public class VarTypes{

    public static void main(String[] args){

        //Java primitives variables below
        //-Integers:
        byte integer1; //From -128 to 127 | 1 Byte used
        short integer2; //From -32.768 to 32.767 | 2 Byte used
        int integer3; //From -2.147.483.648 to 2.147.483.647 | 4 Byte used
        long integer4; //From -9223372036854775808 to 9223372036854775807 | 8 Byte used

        //-floating point variables:
        float flt1  = 23.554f; //From ±1.4E-45 to ±3.4028235E+38 | 4 Byte used   ||   f must be placed behind the last decimal, or a cast must be made.
        float flt2  = (float) 3.5324; //Cast example
        double flt3 = 34.5235; //From ±4.9E-324 to ±1.7976931348623157E+308 | 8 Byte used

        //-Other primitives:
        boolean bool1; //True or False | 1 bit used (theorical size, depen0ds on jvm used)
        char char1; //Contains a unicode character | 2 Byte used

        //Test Signing

    }
}