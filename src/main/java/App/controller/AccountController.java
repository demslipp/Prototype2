package App.controller;

import App.domain.Account;
import App.dto.AccountDto;
import App.dto.DayDto;
import App.service.AccountService;
import App.service.DayService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PutMapping("/update")
    public void updateDay(@Validated @RequestBody List<AccountDto> accountDtos) {
        accountService.updateUser(accountDtos);
    }
}
