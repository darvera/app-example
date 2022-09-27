package com.example.appclient.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor

@Data
@Document(collection = "account")
public class CurrentAccount  extends Account{

    private String typeaccount="Current";
    /*
    private String id;
    private String name;
    private String gender;
    private String age;
    private String identifaction;
    private String address;
    private String phone;
    private String typeAccount="Current";
     */

}
