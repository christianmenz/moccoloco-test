package ch.christianmenz.moccolocotest;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author Christian Menz
 */
public class In {

    private String string;

    private boolean bool;

    private int number;

    private BigDecimal bigDecimal;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }


    @Override
    public boolean equals(Object obj) {
        return Objects.equals(this, obj);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
