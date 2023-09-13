package task4.accountservice;

import task4.Account;

public interface AccountService {
    Account findAccountByOwnerId(long id);
    long countAccountsWithBalanceGreaterThan(long value);
}
