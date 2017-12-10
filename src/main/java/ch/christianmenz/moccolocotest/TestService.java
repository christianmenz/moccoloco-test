package ch.christianmenz.moccolocotest;

import ch.christianmenz.lib.LibraryMoccolocoSupport;
import org.springframework.stereotype.Service;

/**
 * @author Christian Menz
 */
@Service
public class TestService {

    @LibraryMoccolocoSupport("reverse")
    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    @LibraryMoccolocoSupport("in-out")
    public Out compute(In in) {
        Out out = new Out();
        out.setBigDecimal(in.getBigDecimal());
        out.setString(in.getString());
        out.setBool(in.isBool());
        out.setNumber(in.getNumber());
        return out;
    }
}
