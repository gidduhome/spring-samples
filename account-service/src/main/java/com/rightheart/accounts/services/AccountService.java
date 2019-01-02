package com.rightheart.accounts.services;

import com.rightheart.accounts.model.Account;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AccountService {

    public Account getAccount(String accountId){
        return new Account()
                .withId(accountId);
    }

    public void saveAccount(Account account){

    }

    public void updateAccount(Account account){

    }

    public void deleteAccount(Account account){

    }

}
