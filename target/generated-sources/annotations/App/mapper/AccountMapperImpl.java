package App.mapper;

import App.domain.Account;
import App.dto.AccountDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-21T00:34:48+0300",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.8 (JetBrains s.r.o.)"
)
public class AccountMapperImpl implements AccountMapper {

    @Override
    public AccountDto accountToDto(Account account) {
        if ( account == null ) {
            return null;
        }

        AccountDto accountDto = new AccountDto();

        accountDto.setId( account.getId() );
        accountDto.setPhoneNumber( account.getPhoneNumber() );
        accountDto.setFirstName( account.getFirstName() );
        accountDto.setLastName( account.getLastName() );
        accountDto.setGroupId( account.getGroupId() );

        return accountDto;
    }

    @Override
    public Account dtoToAccount(AccountDto accountDto) {
        if ( accountDto == null ) {
            return null;
        }

        Account account = new Account();

        account.setId( accountDto.getId() );
        account.setPhoneNumber( accountDto.getPhoneNumber() );
        account.setFirstName( accountDto.getFirstName() );
        account.setLastName( accountDto.getLastName() );
        account.setGroupId( accountDto.getGroupId() );

        return account;
    }

    @Override
    public List<AccountDto> accountToDto(List<Account> accounts) {
        if ( accounts == null ) {
            return null;
        }

        List<AccountDto> list = new ArrayList<AccountDto>( accounts.size() );
        for ( Account account : accounts ) {
            list.add( accountToDto( account ) );
        }

        return list;
    }

    @Override
    public List<Account> dtoToAccount(List<AccountDto> accountDtos) {
        if ( accountDtos == null ) {
            return null;
        }

        List<Account> list = new ArrayList<Account>( accountDtos.size() );
        for ( AccountDto accountDto : accountDtos ) {
            list.add( dtoToAccount( accountDto ) );
        }

        return list;
    }
}
