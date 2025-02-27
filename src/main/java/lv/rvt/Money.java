package lv.rvt;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        if (euros < 0 || cents < 0) {
            this.euros = 0;
            this.cents = 0;
        } 
        else {
            this.euros = euros;
            this.cents = cents;}
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
        int euros = this.euros + addition.euros();
        int cents = this.cents + addition.cents();
        if (cents > 99) {
            euros++;
            cents-=100;
        }
    
        // return the new Money object
        return new Money(euros, cents);
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
        
        if (cents() - decreaser.cents() < 0) {
            Money newMoney = new Money(euros() - decreaser.euros() - 1, cents() - decreaser.cents() + 100);
            return newMoney;
        }
        
        else if (euros() - decreaser.euros() < 0) {
            Money newMoney = new Money(0, 0);
            return newMoney;
            
        }
        else {
            Money newMoney = new Money(euros() - decreaser.euros(), cents() - decreaser.cents());
            return newMoney;
        }
        
    }
}