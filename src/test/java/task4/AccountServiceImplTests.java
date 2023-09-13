package task4;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import task4.accountservice.AccountServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

public class AccountServiceImplTests {

    private Account[] prepareAccountArray() {
        Account[] accounts = new Account[10];
        for(int i = 0; i < accounts.length; i++) {
            User user = new User(
                    i + 1,
                    "First Name " + (i + 1),
                    "Last Name " + (i + 1)
            );
            Account account = new Account(
                    i + 1001,
                    i + 10001,
                    user
            );
            accounts[i] = account;
        }
        return accounts;
    }

    @Nested
    class FindAccountTests {

        @Test
        void shouldFindAccount() {
            //Given
            Account[] accounts = prepareAccountArray();
            AccountServiceImpl accountService = new AccountServiceImpl(accounts);


            //When
            Account foundAccount = accountService.findAccountByOwnerId(1004);

            //Then
            assertAll(() -> assertEquals(1004, foundAccount.getId()),
                    () -> assertEquals(10004, foundAccount.getBalance()),
                    () -> assertEquals(4, foundAccount.getOwner().getId()),
                    () -> assertEquals("First Name 4", foundAccount.getOwner().getFirstName()),
                    () -> assertEquals("Last Name 4", foundAccount.getOwner().getLastName()));
        }

        @Test
        void shouldNotFindAccount() {
            //Given
            Account[] accounts = prepareAccountArray();
            AccountServiceImpl accountService = new AccountServiceImpl(accounts);


            //When
            Account foundAccount = accountService.findAccountByOwnerId(1011);

            //Then
            assertNull(foundAccount);
        }
    }

    @Nested
    class FindBalanceTests {

        @Test
        void shouldCount3Accounts() {
            //Given
            Account[] accounts = prepareAccountArray();
            AccountServiceImpl accountService = new AccountServiceImpl(accounts);


            //When
            long count = accountService.countAccountsWithBalanceGreaterThan(10007L);

            //Then
            assertEquals(3, count);
        }

        @Test
        void shouldCount0Accounts() {
            //Given
            Account[] accounts = prepareAccountArray();
            AccountServiceImpl accountService = new AccountServiceImpl(accounts);


            //When
            long count = accountService.countAccountsWithBalanceGreaterThan(10010L);

            //Then
            assertEquals(0, count);
        }
    }
}
