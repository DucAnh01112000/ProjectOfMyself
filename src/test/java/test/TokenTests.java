package test;

import base.BaseTest;
import groovyjarjarantlr.Token;
import microservices.token.models.tokenList.TokensModel;
import microservices.token.steps.TokenListSteps;
import org.apache.http.HttpConnection;
import org.apache.http.protocol.HTTP;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;

public class TokenTests extends BaseTest {
    private TokenListSteps tokenListSteps = new TokenListSteps();
    @Test(description = "get list token", groups = {"tokens"})
    public void getListToken(){
        TokensModel tokensModel = (TokensModel)
        tokenListSteps.getListToken()
                .validateStatusCode(HttpURLConnection.HTTP_OK)
                .saveResponseObject(TokensModel.class);
        tokenListSteps.verifyResponseListToken(tokensModel);
    }
}
