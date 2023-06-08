package microservices.token.steps;

import constants.Endpoints;
import core.BaseApi;
import io.qameta.allure.Step;


import microservices.token.models.tokenList.TokensModel;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TokenListSteps extends BaseApi {
    @Step("get list token")
    public TokenListSteps getListToken(){
        sendGet(Endpoints.GET_LIST_TOKEN);
        return this;
    }
    @Step("verify response of get list token")
    public TokenListSteps verifyResponseListToken(TokensModel tokensModel){
        assertThat(tokensModel.getCurrentPage() == 0).isTrue();
        assertThat(tokensModel.getData().size() == 20).isTrue();
        return this;
    }
}
