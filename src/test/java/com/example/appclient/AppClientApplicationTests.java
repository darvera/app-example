package com.example.appclient;

import com.example.appclient.dao.AccountRepository;
import com.example.appclient.model.Account;
import com.example.appclient.model.SavingAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;


@DataMongoTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AppClientApplicationTests {
	@Autowired
	private AccountRepository accountRepository;
	/*
	private String id;
    private String nroAccount;
    private String currentBalance;
    private String status="true";
    private String idUser;
	 */
	@DisplayName("save account type")
	@Test
	public void test() {
		SavingAccount account = new SavingAccount();
		account.setNroAccount("12312321");
		account.setCurrentBalance("12312312");
		account.setIdUser("123123");

		accountRepository.save(account);

		Optional<Account> optionalPerson = accountRepository.findById("6331f837f966ac14e1a5a4f6");
		Account employeeFromDb;
		if (optionalPerson.isPresent()) {
			employeeFromDb = (Account)optionalPerson.get();
		}
		else {
			// could not find in db
		}
	}
	@Test
	public void list(){
		accountRepository.findAll();

	}
	@DisplayName("test one")
	@Test
	public void list_account() {

		for (Account account : accountRepository.findAll()) {
			System.out.println(account);
		}
	}
	/*
        private String id;
        private String nroAccount;
        private String currentBalance;
        private String status="true";
        private String idUser;
         */
	@Test
	public void insertNewAccount() {
		SavingAccount account = new SavingAccount();
		account.setNroAccount("9999999");
		account.setCurrentBalance("123000");
		account.setIdUser("123123");
		accountRepository.save(account);
	}
}
