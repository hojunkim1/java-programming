package autumn.hw2;

public class StrNum {

    private final String form; // 현재 객체의 진법 정보

    private String strData; // 문자열 형태의 숫자 리터럴
    private int val; // 10진수 정수 데이터

    public StrNum(String strData) {
        this.strData = strData;

        // prefix 를 통해 진법을 추정한다.
        this.form = detectNumberFormat(strData);

        // 연산 편의성을 위해 값을 10진법으로 변환하여 저장한다.
        this.val = convertToDecimal(strData, form);
    }

    /**
     * 숫자 리터럴의 prefix 를 통해 진법 정보를 확인하는 메서드
     *
     * @param str 문자열로 표현된 숫자 리터럴
     * @return 숫자 리터럴의 진법 정보
     */
    private static String detectNumberFormat(String str) {
        if (str.startsWith("0x")) return "Hexadecimal";
        if (str.startsWith("0b")) return "Binary";
        if (str.startsWith("0")) return "Octal";
        return "Decimal";
    }

    /**
     * 진법 정보를 통해 숫자 리터럴을 10진수 데이터로 변형하는 메서드
     *
     * @param str    문자열로 표현된 숫자 리터럴
     * @param format str 의 진법 정보
     * @return 10진수 정수
     */
    private static int convertToDecimal(String str, String format) {
        return switch (format) {
            case "Binary" -> Integer.parseInt(str.substring(2), 2);
            case "Octal" -> Integer.parseInt(str, 8);
            case "Decimal" -> Integer.parseInt(str, 10);
            case "Hexadecimal" -> Integer.parseInt(str.substring(2), 16);
            default -> throw new IllegalArgumentException("Invalid number format");
        };
    }

    /**
     * 진법 정보를 통해 10진수 정수를 문자열로 표현된 숫자 리터럴로 변형하는 메서드
     *
     * @param value  10진수 정수
     * @param format 객체의 원래 진법 정보
     * @return 문자열로 표현된 숫자 리터럴
     */
    private static String convertToBase(int value, String format) {
        return switch (format) {
            case "Binary" -> "0b" + Integer.toBinaryString(value);
            case "Octal" -> "0" + Integer.toOctalString(value);
            case "Decimal" -> Integer.toString(value);
            case "Hexadecimal" -> "0x" + Integer.toHexString(value).toUpperCase();
            default -> throw new IllegalArgumentException("Invalid number format");
        };
    }

    /**
     * [val] 의 setter 로 [strData] 도 동시에 업데이트한다.
     *
     * @param val 10진수 정수 데이터
     */
    private void setVal(int val) {
        this.val = val;
        this.strData = convertToBase(this.val, form);
    }

    public StrNum add(StrNum strNum) {
        setVal(this.val + strNum.val);
        return this;
    }

    public StrNum subtract(StrNum strNum) {
        setVal(this.val - strNum.val);
        return this;
    }

    public StrNum multiply(StrNum strNum) {
        setVal(this.val * strNum.val);
        return this;
    }

    public StrNum divide(StrNum strNum) {
        if (strNum.val != 0)
            setVal(this.val / strNum.val);
        else
            System.err.println("0으로 나눌 수 없습니다.");
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        if (this == obj) return true;
        StrNum that = (StrNum) obj;
        return this.val == that.val && this.strData.equals(that.strData) && this.form.equals(that.form);
    }

    @Override
    public String toString() {
        return "[" + form + "] " + strData;
    }
}
