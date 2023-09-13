package task4.accountservice;

import task4.Account;

public class AccountServiceImpl implements AccountService {
    private Account[] accounts;

    public AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public Account findAccountByOwnerId(long id) {
        for(Account account : accounts) {
            if(account.getId() == id) {
                return account;
            }
        }
        return null;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        long count = 0L;
        for(Account account : accounts) {
            if(account.getBalance() > value) {
                count++;
            }
        }
        return count;
    }
}
