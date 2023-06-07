package test;

import base.BaseTest;
import groovyjarjarantlr.Token;
import microservices.token.steps.TokenListSteps;
import org.testng.annotations.Test;

public class TokenTests extends BaseTest {
    private TokenListSteps tokenListSteps = new TokenListSteps();
    @Test(description = "get list token", groups = {"tokens"})
    public void getListToken(){
        tokenListSteps.getListToken();
    }
}
