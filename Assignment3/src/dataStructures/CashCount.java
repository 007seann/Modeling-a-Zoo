package dataStructures;

import zoo.Zoo;

public class CashCount implements ICashCount{

    int countOf20poundsNote;
    int countOf10poundsNote;
    int countOf5poundsNote;
    int countOf2poundsNote;
    int countOf1poundsNote;
    int countOf50p;
    int countOf20p;
    int countOf10p;

    public CashCount() {
        countOf20poundsNote = 0;
        countOf10poundsNote = 0;
        countOf5poundsNote = 0;
        countOf2poundsNote = 0;
        countOf1poundsNote = 0;
        countOf50p = 0;
        countOf20p = 0;
        countOf10p = 0;
    }

    public static CashCount add(CashCount cashCount, CashCount cashInserted) {
        CashCount c = new CashCount();
        c.countOf20poundsNote = cashCount.countOf20poundsNote + cashInserted.countOf20poundsNote;
        c.countOf10poundsNote = cashCount.countOf10poundsNote + cashInserted.countOf10poundsNote;
        c.countOf5poundsNote = cashCount.countOf5poundsNote + cashInserted.countOf5poundsNote;
        c.countOf2poundsNote = cashCount.countOf2poundsNote + cashInserted.countOf2poundsNote;
        c.countOf1poundsNote = cashCount.countOf1poundsNote + cashInserted.countOf1poundsNote;
        c.countOf50p = cashCount.countOf50p + cashInserted.countOf50p;
        c.countOf20p = cashCount.countOf20p + cashInserted.countOf20p;
        c.countOf10p = cashCount.countOf10p + cashInserted.countOf10p;

        return c;
    }

    // return value in pence
    public int getValue() {
        return    2000 * countOf20poundsNote
                + 1000 * countOf10poundsNote
                + 500 * countOf5poundsNote
                + 200 * countOf2poundsNote
                + 100 * countOf1poundsNote
                + 50 * countOf50p
                + 20 * countOf20p
                + 10 * countOf10p;
    }

    public static int subtract(CashCount left, int entranceFee) {
        return left.getValue() - entranceFee;
    }

    // value in pence
    public CashCount pay(int value) {
        CashCount c = new CashCount();

        if(value >= 2000) {
            int n = value / 2000;
            value = value % 2000;
            if(countOf20poundsNote >= n) {
                countOf20poundsNote -= n;
                c.countOf20poundsNote = n;
            } else {
                // Pay up to the current number of money
                c.countOf20poundsNote = countOf20poundsNote;
                value += (n - countOf20poundsNote) * 2000;
                countOf20poundsNote = 0;
            }
        }

        if(value >= 1000) {
            int n = value / 1000;
            value = value % 1000;
            if(countOf10poundsNote >= n) {
                countOf10poundsNote -= n;
                c.countOf10poundsNote = n;
            } else {
                c.countOf10poundsNote = countOf10poundsNote;
                value += (n - countOf10poundsNote) * 1000;
                countOf10poundsNote = 0;
            }
        }

        if(value >= 500) {
            int n = value / 500;
            value = value % 500;
            if(countOf5poundsNote >= n) {
                countOf5poundsNote -= n;
                c.countOf5poundsNote = n;
            } else  {
                c.countOf5poundsNote = countOf5poundsNote;
                value += (n - countOf5poundsNote) * 1000;
                countOf5poundsNote = 0;
            }
        }

        if(value >= 200) {
            int n =  value / 200;
            value = value % 200;
            if(countOf2poundsNote >= n) {
                countOf2poundsNote -= n;
                c.countOf2poundsNote = n;
            } else {
                c.countOf2poundsNote = countOf2poundsNote;
                value += (n - countOf2poundsNote) * 200;
                countOf2poundsNote = 0;
            }
        }

        if(value >= 100) {
            int n =  value / 100;
            value = value % 100;
            if(countOf1poundsNote >= n) {
                countOf1poundsNote -= n;
                c.countOf1poundsNote = n;
            } else {
                c.countOf1poundsNote = countOf1poundsNote;
                value += (n - countOf1poundsNote) * 100;
                countOf1poundsNote = 0;
            }
        }

        if(value >= 50) {
            int n = value / 50;
            value = value % 50;
            if(countOf50p >= n) {
                countOf50p -= n;
                c.countOf50p = n;
            } else {
                c.countOf50p = countOf50p;
                value += (n - countOf50p) * 50;
                countOf50p = 0;
            }
        }

        if(value >= 20) {
            int n = value / 20;
            value = value % 20;
            if(countOf20p >= n) {
                countOf20p -= n;
                c.countOf20p = n;
            } else {
                c.countOf20p = countOf20p;
                value += (n - countOf20p) * 20;
                countOf20p = 0;
            }
        }

        if(value >= 10) {
            int n = value / 10;
            value = value % 10;
            if(countOf10p >= n) {
                countOf10p -= n;
                c.countOf10p = n;
            } else  {
                c.countOf10p = countOf10p;
                value += (n - countOf10p) * 10;
                countOf10p = 0;
            }
        }
        return c;
    }

    public static CashCount sub(CashCount cashCount, CashCount cashInserted) {
        CashCount c = new CashCount();
        c.countOf20poundsNote = cashCount.countOf20poundsNote - cashInserted.countOf20poundsNote;
        c.countOf10poundsNote = cashCount.countOf10poundsNote - cashInserted.countOf10poundsNote;
        c.countOf5poundsNote = cashCount.countOf5poundsNote - cashInserted.countOf5poundsNote;
        c.countOf2poundsNote = cashCount.countOf2poundsNote - cashInserted.countOf2poundsNote;
        c.countOf1poundsNote = cashCount.countOf1poundsNote - cashInserted.countOf1poundsNote;
        c.countOf50p = cashCount.countOf50p - cashInserted.countOf50p;
        c.countOf20p = cashCount.countOf20p - cashInserted.countOf20p;
        c.countOf10p = cashCount.countOf10p - cashInserted.countOf10p;

        return c;
    }

    @Override
    public void setNrNotes_20pounds(int noteCount) {
        countOf20poundsNote = noteCount;
    }

    @Override
    public void setNrNotes_10pounds(int noteCount) {
        countOf10poundsNote = noteCount;
    }

    @Override
    public void setNrNotes_5pounds(int noteCount) {
        countOf5poundsNote = noteCount;
    }

    @Override
    public void setNrCoins_2pounds(int coinCount) {
        countOf2poundsNote = coinCount;
    }

    @Override
    public void setNrCoins_1pound(int coinCount) {
        countOf1poundsNote = coinCount;
    }

    @Override
    public void setNrCoins_50p(int coinCount) {
        countOf50p = coinCount;
    }

    @Override
    public void setNrCoins_20p(int coinCount) {
        countOf20p = coinCount;
    }

    @Override
    public void setNrCoins_10p(int coinCount) {
        countOf10p = coinCount;
    }

    @Override
    public int getNrNotes_20pounds() {
        return countOf20poundsNote;
    }

    @Override
    public int getNrNotes_10pounds() {
        return countOf10poundsNote;
    }

    @Override
    public int getNrNotes_5pounds() { return countOf5poundsNote; }

    @Override
    public int getNrCoins_2pounds() {
        return countOf2poundsNote;
    }

    @Override
    public int getNrCoins_1pound() {
        return countOf1poundsNote;
    }

    @Override
    public int getNrCoins_50p() {
        return countOf50p;
    }

    @Override
    public int getNrCoins_20p() {
        return countOf20p;
    }

    @Override
    public int getNrCoins_10p() {
        return countOf10p;
    }
}



        /*
        if (value >= 10000) {
            int n = (int) value / 10000;
            Count10000 -= n; // n개의 10000 지폐를 내 객체에서 빼놓기
            c.Count10000 = n; // 10000짜리 세팅
            value = value % 10000; // 나머지 돈을 value로 세팅
        }

        if (value >= 5000) {
            int n = (int) value / 5000;
            Count5000 -= n ;
            c.Count5000 = n ;
            value = value % 5000;
        }

        if (value >= 1000) {
            int n = (int) value / 1000;
            Count1000 -= n ;
            c.Count1000 = n ;
            value = value % 1000;
        }

        /// ...compose the right set of coin count in this object

        return c;

         */



/*
    public static CashCount returnChange(CashCount cashInserted) {
        Zoo z = new Zoo();
        CashCount c = new CashCount();
        c.countOf20poundsNote = cashInserted.countOf20poundsNote - z.getEntrancePounds().cashInserted;
        c.countOf10poundsNote = cash
        ...
    }

 */
/*
    int getValue() {

    }


 */
    /*
    public void add(CashCount right) {
        this.coin1 = this.coin1 + right.coin1;
        this.coin2 = this.coin2 + right.coin2;
        ...
        }

        // totalMoney += cashInserter;
        -> totalMoney.add(cashInserter);
     */
