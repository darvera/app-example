package com.example.appclient.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Document(collection = "account")

public class Account {
    private String id;
    private String nroAccount;
    private String currentBalance;
    private String status="true";
    private String idUser;

}
