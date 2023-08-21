package microservices.token.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class TokensModel {
    private ArrayList<TokenDataModel> data;
    private long totalItems;
    private int totalPages;
    private int currentPage;
}
