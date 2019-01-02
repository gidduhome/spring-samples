package com.rightheart.accounts.controllers;

import com.rightheart.accounts.model.Account;
import com.rightheart.accounts.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping(value="v1/accounts/{customerId}")
public class AccountServiceController {
    @Autowired
    private AccountService accountService;

    @RequestMapping(value="/{accountId}",method = RequestMethod.GET)
    public Account getAccount( @PathVariable("customerId") String customerId, @PathVariable("accountId") String accountId) {

        return new Account()
            .withCustomerId(customerId)
            .withId(accountId);
    }

    @RequestMapping(value="{accountId}",method = RequestMethod.PUT)
    public String updateAccount( @PathVariable("accountId") String accountId) {
        return String.format("This is the put");
    }

    @RequestMapping(value="{accountId}",method = RequestMethod.POST)
    public String saveAccount( @PathVariable("accountId") String accountId) {
        return String.format("This is the post");
    }

    @RequestMapping(value="{accountId}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteAccount( @PathVariable("accountId") String accountId) {
        return String.format("This is the Delete");
    }
}
