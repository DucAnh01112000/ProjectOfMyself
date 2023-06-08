package microservices.token.models.tokenList;

import lombok.Data;

@Data
public class TokenDataModel {
    private String name;
    private String displayName;
    private String policy;
    private String fingerprint;
    private int txCount;
    private String supply;
    private String volumeIn24h;
    private String totalVolume;
    private long numberOfHolders;
    private String createdOn;
}