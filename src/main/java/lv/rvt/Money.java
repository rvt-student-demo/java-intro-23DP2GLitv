package lv.rvt;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(euros() + addition.euros(), cents() + addition.cents()); // create a new Money object that has the correct worth
    
        // return the new Money object
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (euros < compared.euros()) {
            return true;
        }

        if (euros == compared.euros() && cents < compared.cents()) {
            return true;
        }

        return false;
    }

    public Money minus(Money decreaser) {
        Money minusMoney = new Money(euros() - decreaser.euros(), cents() - decreaser.cents());
        
        if (minusMoney.cents() < 0) {
            minusMoney = new Money(minusMoney.euros() - 1, minusMoney.cents() + 100);
        }

        if (minusMoney.euros() < 0) {
            minusMoney = new Money(0, 0);
            
        }

        return minusMoney;
    }
}