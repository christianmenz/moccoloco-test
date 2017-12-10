package ch.christianmenz.moccolocotest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author Christian Menz
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/")
    public String index() {
        return testService.reverse("hello world");
    }

    @RequestMapping("/in-out")
    public Out inOut() {
        In in = new In();
        in.setBigDecimal(BigDecimal.TEN);
        in.setNumber(1);
        in.setString("string");
        in.setBool(true);
        return testService.compute(in);
    }
}
