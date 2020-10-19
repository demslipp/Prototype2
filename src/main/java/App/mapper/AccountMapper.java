package App.mapper;

import App.domain.Account;
import App.dto.AccountDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper {

AccountDto accountToDto(Account account);
Account dtoToAccount(AccountDto accountDto);
List<AccountDto> accountToDto(List<Account> accounts);
List<Account> dtoToAccount(List<AccountDto> accountDtos);


}
