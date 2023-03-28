import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
    public void setUP(){
        bankAccount = new BankAccount("william", "dorling", LocalDate.of(1998,5,2), 314159);
    }

    @Test
    public void canCallFirstName(){
        String actual = bankAccount.getFirstName();
        String expected = "william";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canCallLastName(){
        String actual = bankAccount.getLastName();
        String expected = "dorling";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canCallDateOfBirth(){
        LocalDate actual = bankAccount.getDateOfBirth();
        LocalDate expected = LocalDate.of(1998,5,2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canCallAccountNumber(){
        int actual = bankAccount.getAccountNumber();
        int expected = 314159;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canCallBalance(){
        double actual = bankAccount.getBalance();
        double expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canChangeFirstName(){
        bankAccount.setFirstName("Igor");
        String actual = bankAccount.getFirstName();
        String expected = "Igor";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canChangeLastName(){
        bankAccount.setLastName("Biscan");
        String actual = bankAccount.getLastName();
        String expected = "Biscan";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canChangeDateOfBirth(){
        bankAccount.setDateOfBirth(LocalDate.of(1978,5,4));
        LocalDate actual = bankAccount.getDateOfBirth();
        LocalDate expected = LocalDate.of(1978,5,4);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canChangeAccountNumber(){
        bankAccount.setAccountNumber(271828);
        int actual = bankAccount.getAccountNumber();
        int expected = 271828;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canChangeBalance(){
        bankAccount.setBalance(37.89);
        double actual = bankAccount.getBalance();
        double expected = 37.89;
        assertThat(actual).isEqualTo(expected);
    }
}
