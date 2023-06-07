package microservices.token.steps;

import constants.Endpoints;
import core.BaseApi;
import io.qameta.allure.Step;

public class TokenListSteps extends BaseApi {
    @Step("get list token")
    public TokenListSteps getListToken(){
        sendGet(Endpoints.GET_LIST_TOKEN);
        return this;
    }
}
