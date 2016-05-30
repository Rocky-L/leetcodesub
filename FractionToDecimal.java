// All 35 test cases passed, 7ms solution
public static String fractionToDecimal(int numerator, int denominator) {
    long n = (long) numerator, d = (long) denominator;

    List<Long> states = new ArrayList<Long>();
    String beforeDot = n*d >= 0 ? "" : "-";
    n = Math.abs(n);
    d = Math.abs(d);
    beforeDot += n/d + "";
    StringBuilder afterDot = new StringBuilder();
    long reminder = n % d;
    long state = reminder * 10;


    while(!states.contains(state) && reminder != 0){
        states.add(state);
        afterDot.append(state/d);
        reminder = state % d;
        state = reminder * 10;
    }

    if (reminder != 0) {
        int repeatIndex = states.indexOf(state);
        String nonRepeatedDecimals = afterDot.substring(0, repeatIndex);
        String repeatedDecimals = afterDot.substring(repeatIndex);
        return beforeDot + "." + nonRepeatedDecimals + "(" + repeatedDecimals + ")";
    } else if(afterDot.length() == 0) {
        return beforeDot;
    }

    return beforeDot + "." + afterDot.toString();
}
