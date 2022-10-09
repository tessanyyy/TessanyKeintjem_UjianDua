package com.ujiandua.tessany;

package com.ujian.tessany;

        public class CalculationAmount {
    double CalculateCheckBalance(Account account) {
        double resultCheckBalance = 0;

        if ( account.amount > 50000){
            double resultWitdraw = account.amount;
            resultCheckBalance = resultWitdraw;

        }else{
            resultCheckBalance = account.amount;

        }
        return resultCheckBalance;



    }
}