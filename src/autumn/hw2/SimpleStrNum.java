package autumn.hw2;

public class SimpleStrNum {

    private String strData; // 문자열 형태의 숫자 리터럴
    private int val; // 10진수 정수 데이터

    public SimpleStrNum(String strData) {
        this.strData = strData;

        // 매개변수로 받은 문자열을 10진수 정수로 변환한다.
        this.val = Integer.parseInt(strData, 10);
    }

    /**
     * [val] 의 setter 로 [strData] 도 동시에 업데이트한다.
     *
     * @param val 10진수 정수 데이터
     */
    private void setVal(int val) {
        this.val = val;
        strData = Integer.toString(val);
    }

    public SimpleStrNum add(SimpleStrNum strNum) {
        setVal(this.val + strNum.val);
        return this;
    }

    public SimpleStrNum subtract(SimpleStrNum strNum) {
        setVal(this.val - strNum.val);
        return this;
    }

    public SimpleStrNum multiply(SimpleStrNum strNum) {
        setVal(this.val * strNum.val);
        return this;
    }

    public SimpleStrNum divide(SimpleStrNum strNum) {
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
        SimpleStrNum that = (SimpleStrNum) obj;
        return this.val == that.val && strData.equals(that.strData);
    }

    @Override
    public String toString() {
        return "[Decimal] " + strData;
    }
}
